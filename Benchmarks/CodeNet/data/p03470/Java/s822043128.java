import java.util.*;
import java.util.stream.IntStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.CountDownLatch;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] d = new int[n];
        for(int i=0; i<n; i++){
            d[i] = Integer.parseInt(sc.next());
        }
        
        try{
            SleepSort.sort(d);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
        int ans = n;
        for(int i=0; i<n-1; i++){
            if(d[i]==d[i+1]){
                ans--;
            }
        }
        
        System.out.println(ans);
    }
}

class SleepSort{
    public static void sort(int[] array) throws InterruptedException{
        int taskCount = array.length;
        final CountDownLatch latch = new CountDownLatch(taskCount);
        
        List<Integer> res = new ArrayList<>();
        
        for(final int num : array){
            new Thread(new Runnable(){
                public void run(){
                    try{
                        TimeUnit.MILLISECONDS.sleep(num*10);
                        synchronized (res){
                            res.add(num);
                        }
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }finally{
                        latch.countDown();
                    }
                }
            }).start();
        }
        
        latch.await();
        
        int i=0;
        for(int v : res){
            array[i] = v;
            i++;
        }
        
    }
}
import java.util.*;
import java.util.stream.IntStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.CountDownLatch;

public class Main{
    
    static final int SLEEP_TIME = 17;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] d = new int[n];
        for(int i=0; i<n; i++){
            d[i] = Integer.parseInt(sc.next());
        }
        
        final CountDownLatch latch = new CountDownLatch(d.length+1);
        final Count c = new Count();
        
        for(final int num : d){
            new Thread(new Runnable(){
                public void run(){
                    try{
                        TimeUnit.MILLISECONDS.sleep(num*SLEEP_TIME);
                        synchronized(c){
                            c.flagUp();
                        }
                    }catch(InterruptedException e){
                        //e.printStackTrace();
                    }finally{
                        latch.countDown();
                    }
                }
            }).start();
        }
        
        new Thread(new Runnable(){
            public void run(){
                try{
                    for(int i=0; i<103; i++){
                        c.countUp();
                        TimeUnit.MILLISECONDS.sleep(SLEEP_TIME);
                    }
                }catch(InterruptedException e){
                    //e.printStackTrace();
                }finally{
                    latch.countDown();
                }
            }
        }).start();
        
        
        try{
            latch.await();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
        System.out.println(c.getResult());
    }
}

class Count{
    int cnt;
    boolean flag;
    
    public Count(){
        cnt = 0;
        flag = false;
    }
    
    public void flagUp(){
        flag = true;
    }
    
    public void countUp(){
        if(flag){
            cnt++;
            flag = false;
        }
    }
    
    public int getResult(){
        return cnt;
    }
}

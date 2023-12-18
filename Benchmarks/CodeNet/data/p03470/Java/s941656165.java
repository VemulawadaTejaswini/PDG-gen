import java.util.*;
import java.util.stream.IntStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.CountDownLatch;

public class Main{
    
    static final int SLEEP_TIME = 2;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        
        final CountDownLatch start = new CountDownLatch(n+1);
        final CountDownLatch end = new CountDownLatch(n+1);
        final Count c = new Count();
        
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(sc.next());
            new Thread(new Runnable(){
                public void run(){
                    try{
                        start.countDown();
                        start.await();
                        TimeUnit.MILLISECONDS.sleep(num*SLEEP_TIME);
                        synchronized(c){
                            c.flagUp();
                        }
                    }catch(InterruptedException e){
                        //e.printStackTrace();
                    }finally{
                        end.countDown();
                    }
                }
            }).start();
        }
        
        new Thread(new Runnable(){
            public void run(){
                try{
                    start.countDown();
                    start.await();
                    for(int i=0; i<104; i++){
                        c.countUp();
                        TimeUnit.MILLISECONDS.sleep(SLEEP_TIME);
                    }
                }catch(InterruptedException e){
                    //e.printStackTrace();
                }finally{
                    end.countDown();
                }
            }
        }).start();
        
        
        try{
            end.await();
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

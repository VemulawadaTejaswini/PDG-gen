import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        
        Scanner sc = new Scanner(System.in);

        long x = sc.nextInt();

        long memx=0;
        long memy=0;
        for(long i=1; i<=200; i++){
            boolean flag = false;
            for(long j= -200; j<=200; j++){
                if(i*i*i*i*i - j*j*j*j*j == x){
                    memx = i;
                    memy = j;
                    flag = true;
                    break;
                }
            }
            if(flag)break;
        }
        System.out.println(memx + " " + memy);
    }
}
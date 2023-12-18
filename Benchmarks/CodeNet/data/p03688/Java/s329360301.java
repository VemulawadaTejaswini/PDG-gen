/**
 * Created by yoshiwaratomohiro on 2017/06/18.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        int[] a=new int[N];
        int max=0;
        int min=N;

        for(int i=0;i<N;i++){
            a[i]=scan.nextInt();
            max=Math.max(a[i],max);
            min=Math.min(a[i],min);
        }
        if(max-min>1){
            System.out.println("No");
        }else if(max==min) {
            int maxcnt = 0;
            for (int i = 0; i < N; i++) {
                if (a[i] == max) {
                    maxcnt++;
                }
            }
            if(max*2<=maxcnt||max==maxcnt-1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else {
                int mincnt=0;
                int maxcnt=0;
                for(int i=0;i<N;i++){
                    if(a[i]==max){
                        maxcnt++;
                    }else{
                        mincnt++;
                    }
                }
                max-=mincnt;
                if(max<1){
                    System.out.println("No");
                }else{
                    if(max*2>maxcnt){
                        System.out.println("No");
                    }else{
                        System.out.println("Yes");
                    }
                }
            }
        }
    }

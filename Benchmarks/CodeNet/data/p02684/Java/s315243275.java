
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {

    private static void nCombination3(int c) {
        int count = c;
        int num = 0;
        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    num++;
                }
            }
        }
    }



    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long K=sc.nextLong();
        int[] A= new int[N];
        int[] f=new int[N];
        Arrays.fill(f,0);
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt()-1;
        }
        boolean cycle = false;
        int currentindex = 0;
        long count = 0;
        long outcount = 0;
        f[currentindex]++;
        while(true){
            if(f[currentindex]==1){
                outcount++;
            }else if(f[currentindex]==2){
                count++;
            }else if(f[currentindex]>2){
                break;
            }
            currentindex = A[currentindex];
            f[currentindex]++;
            //System.out.println(currentindex+1);
        }
        outcount-=count;
        long gtx = (K-outcount)%count + outcount;
        //System.out.println(gtx);
        currentindex = 0;
        for(long i=0;i<gtx;i++){
            currentindex = A[currentindex];
        }
        System.out.println(currentindex+1);

    }
}

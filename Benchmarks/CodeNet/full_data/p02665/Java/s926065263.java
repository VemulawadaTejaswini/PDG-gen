import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long[] a = new long[n + 1];
        long max =0;
        long ne =1;
        long ans = 0;

        for(int i=0;i<=n;i++){
            a[i]=scn.nextLong();
            max += a[i];
        }
        if(max==0){
            ne=-1;
        }

        for(int i=0;i<=n&&ne>0;i++){
            ans+=ne;
            max=max-a[i];
            ne=(ne-a[i])*2;
            if(ne>max){
                ne=max;
            }
        }
        if(ne<0){
            ans=-1;
        }

        System.out.println(ans);

        scn.close();


    }


}
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        final long waru=1000000007;

        int n=scan.nextInt();
        int []t=new int[n];
        int []a=new int[n];

        int max_t=0,max_a=0;
        boolean ans=true;
        for(int i=0;i<n;i++) {
            t[i] = scan.nextInt();
            if(t[i]>max_t)
                max_t=t[i];
        }
        for(int i=0;i<n;i++) {
            a[i] = scan.nextInt();
            if(max_a<a[i])
                max_a=a[i];
        }
        if(max_a!=max_t)
            ans=false;

        long sum_t=1;
        //System.out.println(sum_t);
        for(int i=1;i<n;i++){
            if(t[i]==t[i-1]){
                if(a[i]<t[i]){
                    if(i==n-1)
                        sum_t=(sum_t*1)%waru;

                    else if(a[i]==a[i+1])
                sum_t = (sum_t*a[i])%waru;
                }
                else
                    sum_t=(sum_t*t[i])%waru;
            }

            //System.out.println(sum_t);


        }
        /*int sum_a=1;
        for(int i=1;i<n;i++){
            if(a[i]!=temp)
                sum_a+=a[i];

        }*/

        if(!ans)
            System.out.println(0);
        else
            System.out.println(sum_t);

    }
}
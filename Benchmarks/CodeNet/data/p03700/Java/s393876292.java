import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a=scan.nextInt();
        int b=scan.nextInt();

        int h[]=new int[n];

        for(int i=0;i<n;i++){
            h[i]=scan.nextInt();
        }

        int ans=0;
        int temp;
        Arrays.sort(h);
        while(true) {
            if(h[n-1]<=0)
                break;

            temp = h[n - 1] / a;
            if (h[n - 1] % a != 0) {
                if(h[n-1]-temp*a<=b){
                    h[n-2]-=(a-b);
                }
                temp++;

            }

            for(int i=0;i<n-1;i++){
                h[i]-=b*temp;
            }
            h[n-1]=0;

            ans+=temp;

            Arrays.sort(h);

        }

        System.out.println(ans);
    }
}

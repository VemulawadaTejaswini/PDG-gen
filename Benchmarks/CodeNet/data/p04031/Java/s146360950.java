import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        int []a=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
            sum+=a[i];
        }
        int ave=sum/n;
        int ans=0;
        int min=100000;
        for(int j=-100;j<=100;j++) {
            ans=0;
            for (int i = 0; i < n; i++) {
                ans += (a[i] - j) * (a[i] - j);

            }
            if(min>ans)
                min=ans;
        }
        System.out.println(min);
    }
}
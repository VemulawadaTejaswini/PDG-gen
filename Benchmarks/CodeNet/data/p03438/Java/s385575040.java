import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n+1];
        int b[] = new int[n+1];
        for (int i=1;i<=n;i++){
            a[i]=in.nextInt();
        }
        for (int i=1;i<=n;i++){
            b[i]=in.nextInt();
        }
        long b_a=0;//b比a大的
        long a_b=0;//a比b大的和
        for (int i=1;i<=n;i++){
            if (a[i]>b[i]){
                a_b+=(a[i]-b[i]);
            }
            else if (a[i]<b[i]){
                b_a+=(b[i]-a[i]);
            }
        }
        if (b_a<a_b*2){
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
    }
}

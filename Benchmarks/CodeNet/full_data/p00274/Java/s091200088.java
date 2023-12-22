import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt();
            if(n==0) {
                break;
            }
            boolean f=false;
            for(int i=0;i<n;i++) {
                int m=sc.nextInt();
                if(m>=2) {
                    f=true;
                }
                if(m==0) {
                    n--;
                }
            }
            System.out.println(f&&n>0?n+1:"NA");
        }
    }
}


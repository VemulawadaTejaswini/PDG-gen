import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tan = new Scanner(System.in);
        while(tan.hasNext()){
            int n,k,sum=0;
            n=tan.nextInt();
            k=tan.nextInt();
            int []a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=tan.nextInt();
            }
            Arrays.sort(a);
            for (int i = 0; i < k; i++) {
                sum=sum+a[i];
            }
            System.out.println(sum);
        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        int k = cin.nextInt();
        int sum = 0;
        int m = Math.min(a, k);
        sum+=m;
        k-=m;
        m = Math.min(b, k);
        k-=m;
        if(k==0)
            System.out.println(sum);
        else
            System.out.println(sum-k);

    }
}

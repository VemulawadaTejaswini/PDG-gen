import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int V;

        int[] a=new int[N];
        
        for(int i=0;i<N;i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        Arrays.stream(a).sum();
        double sum = Arrays.stream(a).sum();
        
        if(sum / (4*M) < a[a.length-M]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if(n==0) {
                break;
            }
            int[] l=new int[n];
            for(int i=0;i<n;i++) {
                l[i]=sc.nextInt();
            }
            Arrays.sort(l);
            int sum=0;
            int total=0;
            for(int i=0;i<n-1;i++) {
                sum+=l[i];
                total+=sum;
            }
            System.out.println(total);
        }
    }
}

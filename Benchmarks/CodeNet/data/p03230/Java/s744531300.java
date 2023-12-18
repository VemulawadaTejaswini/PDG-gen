import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=1;i<100000;i++) {
            if (i*(i+1)/2==N) {
                System.out.println("Yes");
                System.out.println(i+1);
                int[] arr = new int[i];
                for (int j=0;j<i;j++) arr[j] = j+1;
                for (int j=0;j<i+1;j++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append(" ");
                    if (j!=0) {
                        for (int k=0;k<j-1;k++) arr[k] = arr[k]+1;
                        for (int k=j;k<i;k++) arr[k] = arr[k]+i-j;
                    }
                    for (int k=0;k<i;k++) {
                        sb.append(arr[k]);
                        if (k!=i) sb.append(" ");
                    }
                    System.out.println(sb);
                }
                break;
            }
            if (i*(i+1)/2>N) {
                System.out.println("No");
                break;
            }
        }
    }
}
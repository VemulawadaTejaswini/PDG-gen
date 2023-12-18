import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int x = 0;
        if (n%2==0){
            for (int i=0;i<n;i++){
                if (i%2==0){
                    a[(n+i)/2]=scanner.nextInt();
                    x = (n+i)/2;
                }else {
                    a[n-x-1]=scanner.nextInt();
                }
            }
        }else {
            for (int i=0;i<n;i++){
                if (i%2==0){
                    a[(n-i-1)/2]=scanner.nextInt();
                    x = (n-i-1)/2;
                }else {
                    a[n-x]=scanner.nextInt();
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}

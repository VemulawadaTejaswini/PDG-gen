import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.printf("%d",a[n-1]);
        for(int i=n-2;i>=0;i--){
            System.out.printf(" %d",a[i]);
        }
        sc.close();
    }
}

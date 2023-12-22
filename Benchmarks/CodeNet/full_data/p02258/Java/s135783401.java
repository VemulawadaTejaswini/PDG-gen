import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if (a[j]-a[i]>sum)sum=a[j]-a[i];
            }
        }
        System.out.println(sum);
    }
}

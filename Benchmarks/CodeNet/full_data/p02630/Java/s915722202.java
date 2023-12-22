import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100001];
        for (int i=0;i<n;i++){
            a[sc.nextInt()]++;
        }
        int q = sc.nextInt();
        int[] ans = new int[q];
        for (int i=0;i<q;i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            a[c]+=a[b];
            a[b]=0;
            int answer = 0;
            for (int j=1;j<=100000;j++)answer+=(j)*a[j];
            ans[i]=answer;
        }
        for (int i=0;i<q;i++)System.out.println(ans[i]);
    }
}

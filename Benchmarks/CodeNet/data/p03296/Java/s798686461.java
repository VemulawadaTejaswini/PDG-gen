import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int ans = 0;
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count = 0;
        while (count<n){
            int instance = count;
            int dis =0;
            while (a[count]==a[instance]){
                dis++;
                instance++;
            }
            ans+=dis/2;
            count=instance;
        }
        System.out.println(ans);
    }
}

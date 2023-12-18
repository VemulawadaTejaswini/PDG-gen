import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans=0;
        int l[]=new int[N];
        for(int i=0;N>i;i++){
            l[i]=sc.nextInt();
        }
        Arrays.sort(l);
        for(int j=0;K>j;j++){
            ans+=l[N-1-j];
        }
        System.out.println(ans);
    }
}
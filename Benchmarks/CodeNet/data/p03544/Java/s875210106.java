import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        long ans[]=new long[N+1];
        ans[0]=2;
        ans[1]=1;
        for(int i=2;N>=i;i++){
            ans[i]=ans[i-1]+ans[i-2];
        }
        System.out.println(ans[N]);
    }
}
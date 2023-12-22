import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static int a,b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            a=sc.nextInt();
            b=sc.nextInt();
            if(a==0&&b==0){
                sc.close();
                return;
            }
            int ans=0;
            ans+=bit_serch(a, b);
            System.out.printf("%d\n",ans);
        }
    }
    private static int bit_serch(int n,int s){
        int count=0;
        for(int bit=0;bit<(1<<10);++bit){
            int sum=0;
            int count2=0;
            for(int i=0;i<10;i++){
                if((bit&(1<<i))!=0){
                    sum+=i;
                    count2++;
                }
            }
            if (sum==s&&count2==n) count++;
        }
        return count;
    }
}

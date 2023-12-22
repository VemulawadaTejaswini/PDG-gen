import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true){
            int n = sc.nextInt();
            int s = sc.nextInt();
            if(n == 0 && s == 0) break;
            count = sum(n, s, 0, 0, 0);
            System.out.printf("%d\n",count);
        }
    }

    public static int sum(int n,int s,int a,int b,int c){
        int x = 0;
        if(a==s && b==n && c==10)return 1;
        if(c==10)return 0;
        x += sum(n, s, a+c, b+1, c+1);
        x += sum(n, s, a, b, c+1);
        return x;
    }
}

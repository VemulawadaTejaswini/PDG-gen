import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int result = 0;
        int sum;
        for(int i=1;i<=n;i++){
            sum = sum(i);
            if(a<=sum && sum<=b){result+=i;}
        }
        System.out.println(result);
        // System.out.println(sum(12123));
    }

    private static int sum(int a){
        int sum = 0;
        do {
            sum += (a%10);
            a = a/10;
        } while (a>0);
        return sum;
    }
}
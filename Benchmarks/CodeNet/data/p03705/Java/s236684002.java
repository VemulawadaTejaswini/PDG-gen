import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = (b-a)*(n-2)+1;
        if(a > b || ans < 0){
            System.out.println(0);
            return;
        }
        if(a == b && n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(ans);
    }
}

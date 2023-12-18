import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
       
        // 配列
        int a = 0;
        for(int i=0;i<m;i++){
            a += sc.nextInt();
        }
        
        if(a > n){
            System.out.println("-1");
        } else {
            System.out.println(n - a);
        }
    }
}

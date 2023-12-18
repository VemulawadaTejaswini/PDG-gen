import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c  = sc.nextInt();
        int d = sc.nextInt();
        
        int kyori = Math.abs(a-c); 
        
        if(kyori <= d){
            System.out.println("Yes");
        }else{
            int k = Math.abs(a-b);
            int l = Math.abs(c-b);
            if(k <= d && k <= d){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        
    }
}
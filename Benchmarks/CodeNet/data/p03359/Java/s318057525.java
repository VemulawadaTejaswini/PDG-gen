import java.util.*;


public class Main {
    
    public static int math(int a,int b){
        if(a <= b){
            return a;
        }else{
            return b;
        }
    }
    
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        System.out.println(math(month,day));
    }
}
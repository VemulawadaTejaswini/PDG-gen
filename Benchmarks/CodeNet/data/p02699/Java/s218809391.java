import java.util.Scanner;


public class practice {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();//羊
		int X = sc.nextInt();//
        
           String x = (N>X) ?"safe":"unsafe";

           System.out.println(x);

     }


    }

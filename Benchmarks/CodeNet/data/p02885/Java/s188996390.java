import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	int A = 0;	// 窓の横幅用
    	int B = 0;	// カーテンの横幅用
    	int resalt = 0;

        //System.out.println("キーボードから入力してください");

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        A = scan1.nextInt();
        B = scan2.nextInt();
 //       System.out.println("入力された文字は「" + A +　"」です");

        B = B * 2;
            if ( 1 < A ) {
            	if ( A > B ) {
            		resalt = A - B;
            	}
            	else if(A < B){
            		resalt = 0;
            	}
            }
            //System.out.println("結果は" + resalt +"です");
            System.out.println(resalt);
    }
}

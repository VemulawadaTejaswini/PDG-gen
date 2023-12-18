import java.util.Scanner;

/**
 * Created by liguoxiang on 2017/02/18.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int s = sc.nextInt();
        // スペース区切りの整数の入力
        int c = sc.nextInt();



        if((long)s*2>=(long)c){
            System.out.println(c/2);
            return;
        }else{

            long diff=(long)c-(long)s*2;


            System.out.println(diff/4+s);
            return;
        }

    }
}
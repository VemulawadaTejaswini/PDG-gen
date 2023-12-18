import java.util.Scanner;

/**
 * Created by liguoxiang on 2017/02/18.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        long s = sc.nextLong();
        // スペース区切りの整数の入力
        long c = sc.nextLong();



        if(s*2>=c){
            System.out.println(c/2);
            return;
        }else{

            long diff=c-s*2;


            System.out.println(diff/4+s);
            return;
        }

    }
}

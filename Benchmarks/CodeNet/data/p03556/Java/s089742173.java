import java.util.Scanner;

/**
 * Created by itounagamitsu on 2017/11/09.
 */
public class Main {

    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);

        int num = scaner.nextInt();

        for(int i=1;;i++){
            if(i * i > num){
                System.out.println((i-1) * (i-1));
                break;
            }
        }
    }
}

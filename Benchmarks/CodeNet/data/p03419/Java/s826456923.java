import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextInt();
        long b = scanner.nextInt();

        if(a == 2 || b == 2){
            System.out.println(0);
        }else if(a == 1 || b == 1){
            System.out.println(Math.max(a, b)- 2);
        }else{
            System.out.println((a - 2) * (b - 2));
        }
    }



}



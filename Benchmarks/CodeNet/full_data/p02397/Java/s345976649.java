import java.util.Scanner;

public class Main {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmp;
        while(true){
        int x = sc.nextInt();
        int y = sc.nextInt();
            if ( x == 0 ) break;
            if(x > y){
            tmp = x;
            x = y;
            y = tmp;
            System.out.println(x + " " + y);
            }
        }
}

}


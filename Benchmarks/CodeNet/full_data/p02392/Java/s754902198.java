
import java.util.Scanner;


public class Main {
    Main(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String flg;
        if (a < b){
            if (b < c){
                flg = "Yes";
            }else {
                flg = "No";
            }
        }else{
            flg = "No";
        }
        System.out.printf("%s\n", flg);
    }

    public static void main(String[] args){
        new Main();
    }
}


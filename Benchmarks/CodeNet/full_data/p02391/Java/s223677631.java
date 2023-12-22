
import java.util.Scanner;


public class Main {
    Main(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();

        if (i < j){
            System.out.println(i + " < " + j);
        }else if( i > j ){
            System.out.println(i + " > " + j);
        }else if(i==j){
            System.out.println(i + " " + j);
        }
    }

    public static void main(String[] args){
        new Main();
    }
}


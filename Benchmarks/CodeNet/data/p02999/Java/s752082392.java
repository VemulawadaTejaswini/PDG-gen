import java.util.Scanner;

public class Main {
    public static void debug(String str){
        boolean debug = false;
        if(debug != true){
            return;
        }
        System.out.println(str);
    }
    public static void main(String[] args) {

        int X;
        int A;

        try (Scanner sc = new Scanner(System.in)) {
            X = sc.nextInt();
            A = sc.nextInt();
        }

        if(X < A){
            System.out.println(0);
        }else{
            System.out.println(10);
        }


    }


}

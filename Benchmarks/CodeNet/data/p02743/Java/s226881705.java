import java.util.*;

public class Main {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (Math.pow((c-a-b), 2)-4*a*b>0) {
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }


    }
}


import java.util.Scanner;

public class Main extends Exception{
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String a = s1.next()+s1.next();
        int a1= Integer.parseInt(a);
        int a2=(int)Math.sqrt(a1);
        if (a1 == (a2*a2)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}

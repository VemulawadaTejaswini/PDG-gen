import java.util.*;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(Math.ceil((double)a+b/2));
    }
}
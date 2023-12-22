import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int w = sc.nextInt();
        boolean b = w >= s;
        System.out.println(b?"unsafe":"safe");
    }
}
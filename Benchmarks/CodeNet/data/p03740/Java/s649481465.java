import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        if(Math.abs(x-y) <= 1){
            System.out.println("Brown");
        }else{
            System.out.println("Alice");
        }
    }
}
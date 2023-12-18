import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int happy = 0;
        
        happy += 1000*(x/500);
        x = x%500;
        happy += 5*(x/5);
        
        System.out.println(happy);
    }
}
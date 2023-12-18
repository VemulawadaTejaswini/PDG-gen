import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area = r*r*Math.PI;
        
        System.out.println((int)(area/Math.PI));
    }
}
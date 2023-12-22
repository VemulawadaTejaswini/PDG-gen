import java.util.*;                                                                                  

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        double A = (double)r * r * Math.PI;
        double L = (double)r * 2 * Math.PI;
        System.out.println(A + " " + L); 
    }   
}
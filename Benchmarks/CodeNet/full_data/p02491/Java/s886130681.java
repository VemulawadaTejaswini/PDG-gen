import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        int d = a / b;
        int r = a % b;
        double f = (double)a / (double)b;
        System.out.printf("%d %d %.6f\n", d, r, f);
    }
}
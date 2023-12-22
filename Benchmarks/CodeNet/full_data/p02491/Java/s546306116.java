import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        int d = a / b;
        int r = a % b;
        float f = a / (float)b;
        System.out.printf("%d %d %.5f\n", d, r, f);
    }
}
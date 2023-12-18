import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        
        int g = j - i;
        
        for(int f = 1;f < j - i;f++) {
            g += f;
        }
        System.out.print(g - j);
    }
}
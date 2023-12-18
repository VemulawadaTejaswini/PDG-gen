import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String array[][] = new String[3][3];
        
        for(int i = 0; i < 3; i++) {
            array[i] = sc.next().split("");
        }
        
        for(int i = 0; i < 3; i++) {
            System.out.print(array[i][i]);
        }
        
    }
}

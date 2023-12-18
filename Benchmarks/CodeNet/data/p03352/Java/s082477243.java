import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int b; 
        int p;
        if (b == X){
            System.out.println(1);
            return;
        }
        int max = 4;
        for (b = 2; b <= X; ++b){
            for (p = 2; p <= X; ++p){
               max = (int) Math.pow(b,p); 
                if(max > X) {
                    break;
                }
            }
        }
        System.out.println(max);
    }
}
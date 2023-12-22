import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int counter = 0;
        for(int i = 0;i < N;i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(D*D >= (X*X + Y*Y)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}

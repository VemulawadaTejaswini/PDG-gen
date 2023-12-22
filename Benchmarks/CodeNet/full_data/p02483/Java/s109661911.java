import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String[] x = new String[3];
        Scanner in = new Scanner(System.in);
        x[0] = in.next();
        x[1] = in.next();
        x[2] = in.next();
       
        Arrays.sort(x);
       
        for(int i = 0; i < 3; i++){
            System.out.print(x[i] + " ");
        }
    }
}
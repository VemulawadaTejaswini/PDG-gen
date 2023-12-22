import java.util.*;
public class Main {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x[]  = new int[num];
        for (int i = 0; i < num; i++) {
            x[i]  = sc.nextInt();
        }
        for (int i = num-1; i >= 0; i--) {
            if(i==0){
                System.out.println(x[i]);
            }else {
                System.out.print(x[i] + " ");
            }
        }
    }
}

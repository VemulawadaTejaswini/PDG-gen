import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int ans;
        for (int i = 1;i < num1 * 2 ;i++){
            System.out.print(num2 - (num1 - i));
            if (i != num1 * 2 - 1){
                System.out.print(" ");
            }else{
                System.out.println();
            }
        }
    }
}

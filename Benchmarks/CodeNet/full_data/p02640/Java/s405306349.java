import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();

        if(Y % 2 == 1){
            System.out.println("No");
        }else{
            if(Math.round((double)Y/4) <= X && Y/2 >= X){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}

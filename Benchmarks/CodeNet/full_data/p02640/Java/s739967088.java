import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        for(int i = 0; i <= x; i++){
            int k = i;
            int t = x - k;

            if(k * 4 + t * 2 == y){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");

    }
}

import java.util.*;

public class Main{
    public static void main(String[] argc){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            int a = sc.nextInt();
            if(a%2 == 1){
                System.out.println("first");
                return;
            }
        }

        System.out.println("second");
        return;
    }
}
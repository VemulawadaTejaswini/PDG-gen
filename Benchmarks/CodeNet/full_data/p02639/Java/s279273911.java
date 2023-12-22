import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            if(x == 0){
                a = i+1;
                break;
            }
        }
        System.out.println(a);
        sc.close();

    }

}

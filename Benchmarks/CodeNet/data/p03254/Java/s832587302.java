import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int k = 0;
        List<Integer> ai = new ArrayList<>();
        for(int i = 0;sc.nextInt() == 0;i++){
            ai.add(sc.nextInt());
        }
        for(int i = 0;i == n; i++){
            n = n - x;
            k = k + 1;
        }
        System.out.println(k);
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int amex = sc.nextInt();
        int sum = 0;
        int num =0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        for(int i = 0; i < N; i++){
            amex -= list.get(i);
            if (amex >= 0){
                num++;
            }
        }
        if (amex > 0){
            num--;
        }
        System.out.println(num);

    }
}

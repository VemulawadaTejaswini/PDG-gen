import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long x = sc.nextInt();

        List<Long> aList = new ArrayList<>();

        for(int i=0; i<N; i++){
            aList.add((long)sc.nextInt());

        }
        Collections.sort(aList);

        int count = 0;

        for(int i=0; i<N; i++){
            x = x - aList.get(i);
            if(x == 0){
                count += 1;
                break;
            }else if(x < 0){
                break;
            }else if(aList.size()-1 != i){
                count += 1;
            }
        }

        System.out.print(count);

    }
}

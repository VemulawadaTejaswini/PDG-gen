import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    // AtCoder Beginner Contest 154
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int totalCount = 0;
        String[] splt = scanner.nextLine().split(" ");
        List<String> list = new ArrayList<>();
        for(String x : splt){
            list.add(x);
        }
        String yn = "YES";
        Collections.sort(list);
        int[] count = new int[Integer.parseInt(list.get(N-1))+1];
        for(int x = 0; x<N; x++){
            int num = Integer.parseInt(list.get(x));
            count[num]++;
            System.out.println(x + " " + num + " " + count[num]);
            if(count[num]>1){
                yn = "NO";
                break;
            }
        }
        System.out.println(yn);
    }




}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] result = new int[n];
        for(int i = 0 ; i < n ; i++){
            result[i] = 0;
        }
        List<Integer> candidates = new ArrayList<>(n);
        for(int i = 0 ; i < m ; i++){
            candidates.add(-1);
        }

        for(int i = 0 ; i < m ; i++){
            int s = scanner.nextInt();
            int c = scanner.nextInt();

            //zero
            if(s == 1 && c == 0){
                System.out.println("-1");
                System.exit(0);
            }

            //Duplicated
            if(candidates.get(s - 1) >= 0 && candidates.get(s - 1) != c){
                System.out.println("-1");
                System.exit(0);
            }
            candidates.set(s -1 , c);
        }

        for(int i = 0 ; i < n ; i++){
            int c = candidates.get(i);
            if(c >= 0){
                result[i] = c;
            }
        }
        if(result[0] == 0){
            result[0] = 1;
        }

        StringBuilder r = new StringBuilder();
        for(int i = 0 ; i < n ; i++){
            r.append(result[i]);
        }

        System.out.println(r.toString());
    }

}

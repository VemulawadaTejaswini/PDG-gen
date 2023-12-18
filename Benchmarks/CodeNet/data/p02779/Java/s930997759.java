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
        List<String> list = new ArrayList<>();
        for(int x = 0; x<N; x++) {
        list.add(scanner.next());
        }
        String returnval = "YES";


        int[] index = new int[Integer.parseInt(Collections.max(list))+1];
        for(int x =0; x<N; x++){
                index[Integer.parseInt(list.get(x))]++;
            if((index[Integer.parseInt(list.get(x))])>1){
                returnval = "NO";
                break;
            }
        }
        System.out.println(returnval);
    }




}

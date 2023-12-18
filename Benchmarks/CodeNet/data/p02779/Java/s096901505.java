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
        String returnval = "YES";
        for(int x = 0; x<N; x++){
            if(list.contains(splt[x])){
                returnval = "NO";
                break;
            }else{
                list.add(splt[x]);
            }
        }
        System.out.println(returnval);

    }




}

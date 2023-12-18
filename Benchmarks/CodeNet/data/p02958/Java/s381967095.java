import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> sorted = new ArrayList<Integer>();
        for (int index = 0 ; index < n ; index++) {
          Integer integer = scanner.nextInt();
          list.add(integer);
          sorted.add(integer);
        }
        Collections.sort(sorted);

        System.out.println(list);
        System.out.println(sorted);
        
        int errorcount = 0;
        for(int k = 0; k < n;k++) {
          if(!list.get(k).equals(sorted.get(k))) {
            errorcount++;
          }
        }
        
        if(errorcount == 0 || errorcount == 2) {
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
          
    }
}
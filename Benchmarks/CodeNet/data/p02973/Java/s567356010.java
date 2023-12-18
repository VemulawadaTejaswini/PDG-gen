import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int index = 0; index < n; index++) {
          list.add(scanner.nextInt());
        }

        int count = 0;
        Integer standard = Integer.valueOf(-1);
        while(!list.isEmpty()) {
          count++;
          List<Integer> nextList = new ArrayList<Integer>();
          for(Integer integer :list) {
            if(standard.intValue() < integer.intValue()) {
              standard = integer;
            } else {
              nextList.add(integer);
            }
          }
          list = nextList;
          standard=-1;
        }
        
        System.out.println(count);
    }
}
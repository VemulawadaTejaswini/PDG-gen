import java.io.*;
import java.util.*;

public class Main {
  public
    static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int sum = scan.nextInt();

        int v = 0;

        List<Integer> listA = new ArrayList<>();

        for(int i = 0; i < sum; i++){
            int a = scan.nextInt();
            listA.add(a);
        }

        Collections.sort(listA);

        for(int i = 0; i < listA.size(); i++){
            v += listA.get(listA.size() - 1) - listA.get(i);
        }

        System.out.println(v + 1);
        scan.close();

    }
}
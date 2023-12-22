import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        list.add(input.nextInt());
        list.add(input.nextInt());
        list.add(input.nextInt());
        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        for (Integer n : list) {
            sb.append(n).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
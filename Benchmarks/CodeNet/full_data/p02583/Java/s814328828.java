import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) l.add(sc.nextInt());
        List<Integer> sorted = l.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    if (sorted.get(k) != sorted.get(j) 
                            && sorted.get(i) != sorted.get(j) 
                            && sorted.get(k) + sorted.get(j) > sorted.get(i)) 
                    {
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}

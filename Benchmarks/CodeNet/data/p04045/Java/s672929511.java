import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, K, size, i;
        N = input.nextInt();
        K = input.nextInt();
        i = 0;
        List<Integer> list = new Vector<>();
        while (K-- > 0) {
            list.add(input.nextInt());
        }
        String number = Integer.toString(N);
        size = number.length();
        while (i < size) {
            int num = number.charAt(i) - 48;
            if (list.contains(num)) N++;
            else i++;
            number = Integer.toString(N);
        }
        System.out.println(N);
    }
}

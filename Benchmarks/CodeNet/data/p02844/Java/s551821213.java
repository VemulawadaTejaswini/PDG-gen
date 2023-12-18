import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        int count = 0;
        for (int i=0; i<10; i++) {
            if (!s.contains(numbers[i])) continue;
            int index1 = s.indexOf(numbers[i]);
            for (int j=0; j<10; j++) {
                String s2 = s.substring(index1+1, n);
                if (!s2.contains(numbers[j])) continue;
                int index2 = s2.indexOf(numbers[j]);
                int l2 = s2.length();
                for (int k=0; k<10; k++) {
                    String s3 = s2.substring(index2+1, l2);
                    if (!s3.contains(numbers[k])) continue;
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
}
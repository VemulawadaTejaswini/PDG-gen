import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = sc.nextLine().trim();
        long count = 0;
        for (int i = 0; i < s.length(); i++) {
            int remainder = 0;
            long prefixesFound = 0;
            HashSet<Integer> seenRemainder = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                remainder =  (10 * remainder + (s.charAt(j) - '0')) % 2019;
                if (seenRemainder.contains(remainder)) {
                    break;
                }
                seenRemainder.add(remainder);
                if (remainder == 0) {
                    prefixesFound++;
                }
            }
            count += (prefixesFound * (prefixesFound + 1)) / 2;
        }
        System.out.println(count);
    }
}

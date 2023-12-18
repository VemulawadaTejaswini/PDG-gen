/* package whatever; // don't place package name! */

import java.lang.*;
import java.util.*;
import java.util.stream.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        InputStream istream = System.in;
        String text = new BufferedReader(new InputStreamReader(istream))
            .lines()
            .collect(Collectors.joining());
        System.out.println(solve(text));
    }
    
    public static String solve(String input) {
        InputStream istream = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(istream);
        scanner.useDelimiter("\\s*\n?");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        List<Integer> axs = Arrays.stream(scanner.nextLine().split(" ", 0))
            .map(Integer::parseInt).sorted().collect(Collectors.toList());
        int lcount = (int)axs.stream().filter(i -> i < x).count();
        int rcount = x - lcount;
        return String.valueOf(lcount < rcount ? lcount : rcount);
    }
}
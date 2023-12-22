package net.teamfruit;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> data = Arrays
                .stream(new String[] {"AC", "WA", "TLE", "RE"})
                .collect(Collectors.toMap(e -> e, e -> 0));

        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            data.put(s, data.get(s)+1);
        }

        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            System.out.println(entry.getKey() + " x " + entry.getValue());
        }
    }
}

// https://atcoder.jp/contests/abc081/tasks/abc081_b

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N ; i++) {
            list.add(sc.nextInt());
        }

        int count=0;
        while(isEvenList(list)) {
            list = list.stream()
                    .map(i -> i = i /2)
                    .collect(Collectors.toList());
            count++;
        }
        
        System.out.println(count);
    }

    public static boolean isEvenList(List<Integer> list) {
        return list.stream().allMatch(i -> i % 2 == 0);
    }
}
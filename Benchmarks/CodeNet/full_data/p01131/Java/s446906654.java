import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] k = new char[9][];
        for (int i = 0; i < 9; i++)
            k[i] = ".,!? :abc:def:ghi:jkl:mno:pqrs:tuv:wxyz".split(":")[i].toCharArray();
        while (n-- > 0) {
            for (String s : sc.next().split("0"))
                if (s.length() > 0)
                    System.out.print(k[s.charAt(0) - '1'][(s.length() - 1) % k[s.charAt(0) - '1'].length]);
            System.out.println();
        }
    }
}


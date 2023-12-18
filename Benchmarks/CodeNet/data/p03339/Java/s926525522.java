import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = sc.next().split("");
        int minPeople = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int count = 0;
            boolean directToEast = true;
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    directToEast = false;
                    continue;
                }
                if (directToEast && "W".equals(s[j])) {
                    count++;
                } else if (!directToEast && "E".equals(s[j])) {
                    count++;
                }
            }
            if (count < minPeople) {
                minPeople = count;
            }
        }
        System.out.println(minPeople);
    }

}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] people = new int[n];

        int minPosition = 100;
        int maxPosition = 1;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            minPosition = Math.min(minPosition, val);
            maxPosition = Math.max(maxPosition, val);
            people[i] = val;
        }

        int minValue = Integer.MAX_VALUE;
        for (int p = minPosition; p <= maxPosition; p++) {
            int val = 0;
            for (int i = 0; i < n; i++) {
                val += stamina(people[i], p);
            }
            minValue = Math.min(minValue, val);
        }
        System.out.println(minValue);
    }

    private static int stamina(int personStamina, int meetingIndex) {
        return (int) Math.pow(personStamina - meetingIndex, 2);
    }
}

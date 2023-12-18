import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] people = new int[n];
        int[] staminas = new int[n];
        for (int i = 0; i < n; i++) {
            people[i] = sc.nextInt();
        }

        for (int p = 0; p < n; p++) {
            for (int i = 0; i < n; i++) {
                staminas[p] += stamina(people[i], p + 1);
            }
        }

        int minValue = staminas[0];
        for (int i = 0; i < n; i++) {
            if (staminas[i] < minValue) {
                minValue = staminas[i];
            }
        }
        System.out.println(minValue);
    }

    private static int stamina(int personStamina, int meetingIndex) {
        return (int) Math.pow(personStamina - meetingIndex, 2);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = Integer.valueOf(sc.nextLine());
        int[] numbers = new int[size];

        int[] kisuu_numbers = new int[100001];
        int[] guusuu_numbers = new int[100001];

        int most_kisuu_number = 0;
        int most_gusuu_number = 0;


        String[] tmp = sc.nextLine().split(" ");
        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.valueOf(tmp[i]);
            if ((i+1) % 2 == 1) {
                kisuu_numbers[numbers[i]]++;
            } else {
                guusuu_numbers[numbers[i]]++;
            }
        }
        int max = 0;
        for (int i = 0; i < kisuu_numbers.length; i++) {

            if (kisuu_numbers[i] > max) {
                max = kisuu_numbers[i];
                most_kisuu_number = i;
            }
        }
        max = 0;
        for (int i = 0; i < guusuu_numbers.length; i++) {
            if (guusuu_numbers[i] > max) {
                max = guusuu_numbers[i];
                most_gusuu_number = i;
            }

        }
        int kaikaesuu = (size / 2 - kisuu_numbers[most_kisuu_number]) + (size / 2 -guusuu_numbers[most_gusuu_number]);
        System.out.println(kaikaesuu);


    }
}

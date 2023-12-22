import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] box;
        box = new int[3];

        for (int i = 0; i < 3; i++)
            box[i] = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (box[i] > box[j]) {
                    int temp;
                    temp = box[i];
                    box[i] = box[j];
                    box[j] = temp;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            if (i == 0)
                System.out.print(box[i]);
            else
                System.out.printf(" %d", box[i]);
        }


    }

}


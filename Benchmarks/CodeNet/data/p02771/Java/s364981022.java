import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[3], num = 0;
        int count = 0;

        while (count < 3) {
            num = inputNumRecursive(sc);
            if (0 < num && num < 10) {
                array[count] = num;
                count++;
            }
        }


        for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 3; j++) {
                    if (array[i] == array[j]) {
                        count = count - 1;
                    }
                }
        }
        if (count == 2) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }

    }
    static int inputNumRecursive(Scanner sc) {
        try {
            int ret = Integer.parseInt(sc.nextLine());
            if(0 < ret && ret < 10) {
                return ret;
            }
        }
        catch(NumberFormatException e) {}

        return inputNumRecursive(sc);
    }

}

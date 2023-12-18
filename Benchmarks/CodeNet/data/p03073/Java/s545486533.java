import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("");
        int n = input.length;
        int[] array = new int[n];
        
        for (int i=0; i<array.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        int[] test1 = new int[n];
        int[] test2 = new int[n];

        test1[0] = 0;
        test2[0] = 1;

        int amari = 0;
        for (int i=1; i<n; i++) {
            amari = i % 2;
            if (amari == 1) {
                test1[i] = 1;
                test2[i] = 0;
            } else {
                test1[i] = 0;
                test2[i] = 1;
            }
            
        }

        int total_test1 = 0;
        int total_test2 = 0;
        for (int i=0; i<n; i++) {
            // test1
            if (array[i] != test1[i]) {
                total_test1++;
            }
            // test2
            if (array[i] != test2[i]) {
                total_test2++;
            }
        }

        if (total_test1 <= total_test2) {
            System.out.println(total_test1);
        } else {
            System.out.println(total_test2);
        }
    }
}
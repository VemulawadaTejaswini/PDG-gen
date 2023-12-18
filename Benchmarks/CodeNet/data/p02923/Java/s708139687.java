import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collections;
        import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int counter = 0;
        int prev = 0;
        int max = 0;

        if (n == 1) {
            System.out.println(0);
            System.exit(0);
        }
        for (int i = 0; i < n; i++) {
            int current = sc.nextInt();
            if (current > prev) {
                if (counter > max) {
                    max = counter;
                }

                counter = 0;
            } else {
                counter++;
            }
            
            prev = current;
        }
      
      	if (counter > max) {
         	max = counter; 
        }

        System.out.println(max);


    }
}
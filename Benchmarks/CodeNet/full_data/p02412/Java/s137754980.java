import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numIn;
        int sum;
        int numPattern;
        int i, j, k;
        while (true) {
            numIn = sc.nextInt();
            sum = sc.nextInt();
            numPattern = 0;
            if (numIn == 0 && sum == 0) break;
            for (i = 1; i <= numIn; i++) {
                for (j = i + 1; j <= numIn; j++) {
                    for (k = j + 1; k <= numIn; k++) {
                        if (i + j + k == sum) numPattern += 1;
                    }
                }
            }
            System.out.println(numPattern);
        }
    }
}


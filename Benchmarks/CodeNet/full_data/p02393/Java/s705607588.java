import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] no = new int[3];
        no[0] = sc.nextInt();
        no[1] = sc.nextInt();
        no[2] = sc.nextInt();
        
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (no[i] > no[j]) {
                    int tmp = no[i];
                    no[i] = no[j];
                    no[j] = tmp;
                }
            }
        }
        
        System.out.println(no[0] + " " + no[1] + " " + no[2]);
    }

}


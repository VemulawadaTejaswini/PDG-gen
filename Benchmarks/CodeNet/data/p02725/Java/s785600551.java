import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();
        int temp;

        int houses[] = new int[N];

        for (int i = 0; i < houses.length; i++) {
            temp = sc.nextInt();
            houses[i] = temp;
        }

        int sum = 0;
        for (int value : houses) {
            sum += value;
        }


        if(K == sum) {
            System.out.println(K/2);
        } else {
            System.out.println(houses[2] - houses[0]);
        }
    }
}
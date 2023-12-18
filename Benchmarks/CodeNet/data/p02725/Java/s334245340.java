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


        if (K == sum) {
            System.out.println(K / 2);
        }

        if (sum > K) {
            if (houses[2] - houses[0] == houses[1]) {
                System.out.println(houses[2] - houses[0]);
            }
            else if ((houses[2] - houses[1]) + ((K - houses[2]) + houses[0]) > K) {
                    System.out.println((houses[0] - houses[2]));
                } else {
                System.out.println((houses[2] - houses[1]) + ((K - houses[2]) + houses[0]));}
            }
         else if ( sum < K) {
            System.out.println(houses[2] - houses[0]);
        }
    } }
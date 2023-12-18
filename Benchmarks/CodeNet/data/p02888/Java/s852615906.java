import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] sticks = new int[N];

        for(int i = 0; i < N; i++) {

            sticks[i] = Integer.parseInt(sc.next());
        }

        sc.close();

        int count = 0;

        for(int i = 0; i < N; i++) {

            for(int j = i+1; j < N; j++) {


                for(int k = j+1; k < N; k++) {

                    if(sticks[i] < sticks[j] + sticks[k] &&
                            sticks[j] < sticks[i] + sticks[k] &&
                                sticks[k] < sticks[i] + sticks[j]) {

                        count++;
                    }

                }
            }
        }

        System.out.println(count);
    }

}
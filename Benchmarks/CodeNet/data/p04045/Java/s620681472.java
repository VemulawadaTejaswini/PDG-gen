import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int [] arr = new int[10];
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < K; i++) {
            arr[sc.nextInt()]++;
        }

        for(int i = 0; i < 10; i++) {
            if(arr[i] == 0) list.add(i);
        }

        boolean isValid = true;
        int A = N;
        int digitCount = 0;

        while(A != 0)  {
            digitCount++;
            A /= 10;
        }

        A = N;
        while(A != 0) {
            int temp = A % 10;
            if(arr[temp] == 1) {
                isValid = false;
                break;
            }
            A /= 10;
        }

        if(!isValid) {
            if(list.get(0) == 0) {
                N = list.get(1) * (int) Math.pow(10, digitCount - 1);
                System.out.println(N);
            } else {
                int temp = 0;
//                System.out.println(digitCount);
                digitCount--;
                while(digitCount != 0) {
                    temp *= 10;
                    temp += list.get(0);
                    digitCount--;
                }
                N = temp;
                System.out.println(N);
            }
        } else {
            System.out.println(N);
        }
    }
}

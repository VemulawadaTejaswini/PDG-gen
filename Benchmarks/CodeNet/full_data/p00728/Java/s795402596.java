import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] input = new int[20];
            int i,max = 0, min = 1000, sum = 0;
            for (i = 0; ; i++) {
                input[i] = sc.nextInt();
                if(input[i] == 0) break;
                if(input[i] > max) max = input[i];
                if(input[i] < min) min = input[i];
                sum += input[i];
            }
            int ave = (sum - max - min)/(i-2);

            System.out.println(ave);
        }
    }
}

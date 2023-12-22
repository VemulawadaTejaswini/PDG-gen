import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int max = 0;
        int small =1000;
        int sum=0;
        int average=0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[] values = new int[n];
            for (int i = 0; i < values.length; i++) {
                values[i] = sc.nextInt();
            }
            for (int j = 0; j < values.length; j++) {
                if (max < values[j]) {
                    max = values[j];
                }
                if (small > values[j]) {
                    small = values[j];
                }
            }
            for(int j=0;j<values.length;j++){
                sum=sum+values[j];
            }
            average=(sum-max-small)/(n-2);
            System.out.println(average);
            sum=0;
            small=1000;
            max=0;
            }

    }
}


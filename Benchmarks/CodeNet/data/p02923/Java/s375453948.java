import java.util.Arrays;
import java.util.Scanner;
public class d01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] max = new int[n];
        int initial =0;
        for (int i=0;i<n;i++){
            int mas = sc.nextInt();
            array[i] = mas;
        }
        for (int j=0;j<n;j++){
            int result =0;
            while(array[initial]>array[initial+1] && initial < n-1) {
                result++;
                initial++;
            }
            max[j] = result;
        }
        int maximum = Arrays.stream(max).max().getAsInt();
        System.out.println(maximum);
    }
}

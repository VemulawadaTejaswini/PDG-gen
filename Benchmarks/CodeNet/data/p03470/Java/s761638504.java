import java.util.Arrays;
import java.util.Scanner;
// ABC 085
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int mochi = sc.nextInt();
        int[] size = new  int[mochi];
        for(int i = 0; i < mochi; i++) size[i] = sc.nextInt();
        Arrays.sort(size);
        int dan = 0;
        int kagamimochi = 0;
        for(int i = 0; i < mochi; i++) {
            if(kagamimochi < size[i]) {
                dan++;
                kagamimochi = size[i];
            }
        }
        System.out.println(dan);
    }
}

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int standard = s.nextInt();
        int array[] = new int[standard];

        for (int i = 0; i < standard; i++) {
        	// Ai-iの計算
            array[i] = s.nextInt() - i - 1;
        }

        Arrays.sort(array);
        int median = 0;

        //中央値算出
        switch (array.length % 2) {
         case 0:
          median = array[(array.length/2)-1];
          break;
         case 1:
             median = array[array.length/2];
          break;
        }

        int ans = 0;
        for (int i = 0; i < standard; i++) {
            ans += Math.abs(array[i]-median);
        }

        System.out.println(ans);
    }
}
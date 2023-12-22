import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[3];

        for(int i=0;i<3;i++){
        String str = scan.next();
        array[i] = Integer.parseInt(str);
        }

        Arrays.sort(array);

        System.out.println(array[0] + " " + array[1] + " " + array[2]);
    }
}

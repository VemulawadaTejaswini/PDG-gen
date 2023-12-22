import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int array[] = new int[4];
        array[0] = a * c;
        array[1] = a * d;
        array[2] = b * c;
        array[3] = b * d;
        Arrays.sort(array);
        
        System.out.println(array[3]);
    }
}
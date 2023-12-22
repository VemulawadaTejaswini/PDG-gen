import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        Integer array[] = {1, 1, 1, 1, 1,1, 1, 1, 1, 1}; 
        for(int i = 0; i < 10; ++i){
        	array[i] = sc.nextInt();
        }
        Arrays.sort(array, Comparator.reverseOrder());
        for(int i = 0; i < 3; ++i){
            System.out.println(array[i]);
        }
    }
}
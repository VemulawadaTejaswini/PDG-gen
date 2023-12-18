import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {

	//private static Scanner sc;

public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        String element=Integer.toString(n);
//        
        
        int sum=Character.getNumericValue(element.charAt(0))+Character.getNumericValue(element.charAt(1))+Character.getNumericValue(element.charAt(2))+Character.getNumericValue(element.charAt(3));
        System.out.println(sum);
        

	}

}

import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();
		
		String[][] list = new String [N][10];
		
		for (int index=0; index<N; index++){
		   String s = sc.next();
		   list[index] = s.split("");
		   Arrays.sort(list[index]);
		}
		
		long count = 0;
		
		for (int index=0; index<N; index++){
            for (int index2=index+1; index2<N; index2++){
		        if (Arrays.equals(list[index],list[index2])){
		            count++;
		        }
		    }
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		  Scanner  scan = new   Scanner (System.in);
		int[]array=new int[3];
		array[0]=scan.nextInt();
		array[1]=scan.nextInt();
		array[2]=scan.nextInt();
		Arrays.sort(array);
		System.out.println(array[0]+array[1]);
	}

}
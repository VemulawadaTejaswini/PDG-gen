import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class Main{
	public static void main(String[] a){
			Scanner sc=new Scanner(System.in);
			Integer[] input=new Integer[10];
			for(int i=0;i<10;i++){
				input[i]=Integer.parseInt(sc.nextLine());
			}
			Arrays.sort(input,Collections.reverseOrder());
		for(int j=0;j<3;j++){
		System.out.println(input[j]);
		}
	}
}
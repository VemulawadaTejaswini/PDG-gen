import java.util.Arrays;
import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
	int[] input=new int[5];
	int[] output=new int[5];
	for(int i=0;i<input.length;i++){
		input[i]=scan.nextInt();
	}
	Arrays.sort(input);
	for(int i=0;i<input.length;i++){
		output[i]=input[input.length-i-1];
	}
	System.out.println(output[0]+" "+output[1]+" "+output[2]+" "+output[3]+" "+output[4]);
	}

}
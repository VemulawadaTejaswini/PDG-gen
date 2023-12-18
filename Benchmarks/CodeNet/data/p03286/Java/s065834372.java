import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if(input<0){
			input = Math.abs(input)+2;
		}
	//	System.out.println(Integer.toBinaryString(input));
	//	if(input>0){
			System.out.println(Integer.toBinaryString(input));
	//	}
	/*	else{
			input+=2;
			System.out.println(Integer.toBinaryString(input));
		}*/
	}
}

import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args){

 		int[] left = new int[1000];
 		int[] right = new int[1000];
 		char[] sign = new char[1000];
 		
 		String buffer;
		Scanner scan = new Scanner(System.in);

		int i = 0;
		while(true){

			left[i] = scan.nextInt();
			buffer = scan.next();
			right[i] = scan.nextInt();
			sign[i] = buffer.charAt(0);
			if(sign[i] == '?'){
				break;
			}
			i++;
			
		}

		i = 0;
		
		while(sign[i] != '?'){

			switch(sign[i]){

				case '+':
					System.out.println(left[i]+right[i]);
					break;
				case '-':
					System.out.println(left[i]-right[i]);
					break;
				case '*':
					System.out.println(left[i]*right[i]);
					break;
				case '/':

					System.out.println(left[i]/right[i]);
					break;
			}
			i++;


		}



	}
}
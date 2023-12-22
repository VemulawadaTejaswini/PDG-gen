import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int[] dif = {4,0,1,4,6,2,4,0,3,5,1,3};
		String[] day = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		String[] result = new String[10000];
		int index = 0;
		
		int m = stdIn.nextInt();
		int d = stdIn.nextInt();
		while( m != 0 ){
			result[index] = day[(dif[m-1]+d-1)%7];
			index++;
			m = stdIn.nextInt();
			d = stdIn.nextInt();
		}
		for(int i = 0; i < index; i++){
			System.out.println(result[i]);
		}
	}
}
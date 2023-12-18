import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean a [] =new boolean [3];
		Arrays.fill(a, true);
		int x = scan.nextInt();
		a[x-1] = false;
		x = scan.nextInt();
		a[x-1] = false;
		for(int i =0; i< 3; i++){
		    if(a[i]){
		        System.out.print(i+1);
		        break;
		    }
		}
		
	}
}
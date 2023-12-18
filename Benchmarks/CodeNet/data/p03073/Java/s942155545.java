import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int[] arr = new int[str.length()];
		int[] arr2 = new int[str.length()];
		int a=0,b=0;
		for(int i=0; i<str.length(); i++){
			arr[i] = str.charAt(i)-48;
			if(i%2==0){
				arr2[i]=1;
			}
		}
		for(int i=0; i<str.length(); i++){
			if(arr[i]==arr2[i]){
				a++;
			}
			else{
				b++;
			}
		}
		System.out.println(Math.min(a, b));
	}

}
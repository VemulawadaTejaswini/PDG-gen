import java.util.*;
public class Main {

	static Scanner sc = new Scanner(System.in); 
	static int[] intArray = new int[5];
	public static void main(String[] args) {
		read();
		slove();
	}
	static boolean read(){
		int i;
		int value;
		for(i = 0; i < 5; i++){
			value = sc.nextInt();
			intArray[i] = value;
		}
		return true;
	}
	static void slove(){
		java.util.Arrays.sort(intArray);
		int j;
		for(j = 4; j > 0; j--){
			System.out.print(intArray[j] + " ");
		}
		System.out.println(intArray[0]);
	}
}
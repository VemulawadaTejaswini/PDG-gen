import java.util.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[9];
		for(int i = 0; i < 9; i++){
			a[i] = sc.nextInt();
		}
		int b1 = a[0];
		int b2 = a[1];
		int b3 = a[2];
		
		int a1 = 0;
		int a2 = a[3] - b1;
		int a3 = a[6] - b1;
		
		int check = 0;
		if(a[4] != a2 + b2 || a[5] != a2 + b3 || a[7] != a3 + b2 || a[8] != a3 + b3){
			check++;
		}
		
		if(check == 0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}

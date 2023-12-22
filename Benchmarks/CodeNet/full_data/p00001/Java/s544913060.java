import java.util.*;
class 0001{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int[] top = new int[10];
		for(int i = 0; i < 10; i++){
			top[i] = scan.nextInt();
		}
		for(int i = 0; i < 9; i++){
			for(int j = 9; j > i; j--){
				if(top[j] > top[j-1]){
					int multi = top[j];
					top[j] = top[j-1];
					top[j-1] = multi;
				}
			}
		}
		System.out.println(top[0]);
		System.out.println(top[1]);
		System.out.println(top[2]);
	}
}
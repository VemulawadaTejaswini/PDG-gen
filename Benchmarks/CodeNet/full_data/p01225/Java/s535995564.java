import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t;
		int[] n = new int[9];
		char[] c = new char[9];
		int tempInt;
		char tempChar;
		int count;
		t = sc.nextInt();
		for(int i = 0; i < t; i++){
			count = 0;
			for(int j = 0; j < 9; j++)
				n[j] = sc.nextInt();
			for(int j = 0; j < 9; j++)
				c[j] = sc.next().charAt(0);
			for(int j = 0; j < 8; j++){
				for(int k = j+1; k < 9; k++){
					if(n[j] > n[k]){
						tempInt = n[j];
						n[j] = n[k];
						n[k] = tempInt;
						tempChar = c[j];
						c[j] = c[k];
						c[k] = tempChar;
					}
				}
			}
			for(int j = 0; j < 7; j++){
				if((c[j] == c[j+1]) && (c[j+1] == c[j+2])){
					if((n[j] == n[j+1]) && (n[j+1] == n[j+2])){
						count++;
						j += 2;
					}else if((n[j+2] - n[j+1]) == 1 && (n[j+1] - n[j]) == 1){
						count++;
						j += 2;
					}
				}
			}
			System.out.println((count == 3) ? 1 : 0);
		}
	}
}
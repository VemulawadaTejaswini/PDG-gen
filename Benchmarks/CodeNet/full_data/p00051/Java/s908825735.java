import java.util.Arrays;
import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[]=new int[8];
		for(int i = 0; i < n ; i++){
			int max=0,min=0;
			String str = sc.next();
			for(int j = 0; j < 8; j++){
				num[j]=Integer.parseInt(String.valueOf(str.charAt(j)));
			}
			Arrays.sort(num);
			for(int j = 0; j < 8; j++){
				max += num[j]*Math.pow(10, j+1);
				min += num[j]*Math.pow(10, 8-j);
				
			}
			System.out.println(max-=min/10);
		}
	}	
}
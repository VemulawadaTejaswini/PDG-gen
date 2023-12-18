import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		char[][] s=new char[200][20];
		for(int i = 0; i<100; i++){
			Arrays.fill(s[i],'#');
		}
		for(int i = 100; i<200; i++){
			Arrays.fill(s[i],'.');
		}
		for(int i = 0; i<a-1; i++){
			s[(i/10)*2][(i%10)*2]='.';
		}
		for(int i = 0; i<b-1; i++){
			s[199-(i/10)*2][(i%10)*2]='#';
		}
		System.out.println(100+" "+40);
		for(int i = 0; i<200; i++){
			for(int j = 0; j<20; j++){
				System.out.print(s[i][j]);
			}	
			System.out.println();
		}
	}
}

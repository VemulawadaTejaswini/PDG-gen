
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int f = 0;
		int s = 0;
		int temp = 0;
		int[] amida = new int[w];
		for(int i = 0 ; i < w ; i ++)
			amida[i]=i+1;
		for(int i = 0 ; i < n ; i ++){
			f=sc.nextInt();
			s=sc.nextInt();
			temp=amida[f];
			amida[f]=amida[s];
			amida[s]=temp;
		}
		for(int i = 0;i>0;i++){
			System.out.println(amida[i]);
		}
	}
}
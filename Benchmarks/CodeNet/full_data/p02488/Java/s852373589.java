import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		int m = 0;
		for(int i = 0; i < n; i++)
			str[i] = sc.next();
		for(int i = 1; i < n; i++){
			if(str[m].compareTo(str[i]) > 0)
				m = i;
		}
		System.out.println(str[m]);
	}
}
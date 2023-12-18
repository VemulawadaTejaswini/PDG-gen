import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int red = 0; 
		int blue=0;
		for(int i = 0; i<n; i++){
			if(s.charAt(i)=='R'){
				red++;
			}else if(s.charAt(i)=='B'){
				blue++;
			}
		}
		if(red>blue){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}

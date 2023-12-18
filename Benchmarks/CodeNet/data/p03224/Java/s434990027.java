import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==3){
			System.out.println("Yes");
			System.out.println(3);
			for(int i=1; i<=3; i++){
				System.out.println(2+" "+i+" "+(i%3+1));
			}
		}else{
			System.out.println("No");
		}
	}
}

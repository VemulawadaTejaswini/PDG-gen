import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		double count=0;
		for(int i = 0; i<n; i++){
			long a = sc.nextLong();
			if(a%4==0){
				count++;
			}
		}
		if(count>=Math.ceil(n/3)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
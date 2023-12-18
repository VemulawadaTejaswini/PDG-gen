import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t = sc.nextInt();
		int max=0;
		int sum=0;
		for(int i = 0; i < t; i++){
			int l = sc.nextInt();
			if(max<l){
				sum+=max;
				max=l;
			}else{
				sum+=l;
			}
		}
		if(sum>max){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
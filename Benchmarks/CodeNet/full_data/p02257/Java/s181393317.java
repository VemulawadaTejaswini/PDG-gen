import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count=0;
		int n = Integer.parseInt(sc.nextLine());

		for(int i=0;i<n;i++){
			int num=Integer.parseInt(sc.nextLine());
			int num2=num/2;
			boolean f=true;
			for(int j=2;j<num2;j++){
				if(num%j==0){
					f=false;
					break;
				}
			}
			if(f){
				count++;
			}
		}
		System.out.println(count);
	}
}


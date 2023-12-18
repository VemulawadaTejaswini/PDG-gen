import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		boolean judge=false;
		for(int i=0; i<n; i++){
			long a=sc.nextLong();
			if(a%2!=0){
				judge=true;
			}
		}
		if(judge){
			System.out.println("first");
		}else{
			System.out.println("second");
		}
	}
}



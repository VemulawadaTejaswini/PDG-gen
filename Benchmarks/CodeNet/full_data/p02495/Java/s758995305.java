import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a == 0&&b == 0){
			System.exit(0);
		}
		
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				if(i%2==1&&j%2==1 || i%2==0&&j%2==0){
		System.out.print("#");
				}else{
					System.out.print(".");
				}
		if(j+1==b){
			System.out.print("\n");
		}
		}
	}
		System.out.print("\n");
		}
}
}
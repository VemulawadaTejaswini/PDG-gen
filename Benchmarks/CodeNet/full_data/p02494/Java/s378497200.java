import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		while(true){
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		if(H==0 && W==0){
			break;
		}
	for(int i=1;i<=H;i++){
		for(int j=1;j<=W;j++){
			System.out.printf("#");
		}
		System.out.printf("\n");
	}
	
	}
}
}
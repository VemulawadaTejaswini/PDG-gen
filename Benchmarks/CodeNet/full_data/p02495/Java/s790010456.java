import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	while(true){
	int H=sc.nextInt();
	int W=sc.nextInt();
	if(H==0&&W==0){
	break;
	}
	for(H=0;1<H;H++){
		for(W=0;W<300;W++){
		System.out.printf("#");
		}
		System.out.printf("\n");
	}
	}
	}
}
import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
while(true){
	int H = sc.nextInt();
	int W = sc.nextInt();
	int i,j;
	
	if(H == 0&&W == 0){
		break;
	}
	for(i = 1;i <= H;i++){
	for(j = 1;j <= W;j++){
	System.out.print("#");
	}
	System.out.println("");
	}
	}
}
}
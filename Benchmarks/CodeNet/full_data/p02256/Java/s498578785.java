package ex1;
import java.util.Scanner;
class GreatestCommonDivisor {
public static void main(String[] args){
	int z;
	Scanner scanner=new Scanner(System.in);
	int x = scanner.nextInt();
	int y = scanner.nextInt();
	while(true){
		z=x%y;
		if(z==0){
			System.out.println(y);
			break;
		}
		else{
			x=y;
			y=z;
		}
	}
}
}


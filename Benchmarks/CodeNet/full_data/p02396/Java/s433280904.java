import java.util.Scanner;

public class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	for(int i=0;;i++){
		int x = sc.nextInt();
		switch(x){
		case 1:
			if(x > 0){
			System.out.println("Case i: x");
			break;
			}
		case 2:
			if(x == 0){
			break;
		}
		}
	}
}
}
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int nn = sc.nextInt();
		int i=0;
		
		for (i=2;i<10;i++){
			if(nn%i==0){
				System.out.print("yes");
				break;
			}
		}
		
		if(i==10){
			System.out.print("no");
		}
		
	}
}
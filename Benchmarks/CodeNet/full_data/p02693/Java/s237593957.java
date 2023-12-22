import java.util.*;

public class Main{
//public class abc165_a{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		boolean flag = false;		
		for(int i=a ;i<=b ; i++){
			if(i%k == 0){
				flag = true;
				System.out.println("OK");
				break;
			}
		}
		if(!flag) System.out.println("NG");
	}

}
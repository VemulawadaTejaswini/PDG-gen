import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int nn = sc.nextInt();
		String ss = sc.next();
		
		if(nn%2==1) {
			System.out.print("No");
			return;
		}
		for (int i=0;i*2<nn;i++){
			if(ss.charAt(i) != ss.charAt(nn/2+i)) {
				System.out.print("No");
				return;
			}
		}
		
		System.out.print("Yes");
		
		
	}
}
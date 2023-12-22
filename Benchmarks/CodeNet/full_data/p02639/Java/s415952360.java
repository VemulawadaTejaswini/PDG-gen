//package atcoder;
 
import java.util.*;
//import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s[] = new int [5];
		for(int i=0;i<5;i++) {
			s[i] = sc.nextInt();
		}
		for(int j=0;j<5;j++) {
			if(s[j]==0) {
				System.out.println(j+1);
				break;
			}
		}
		
	}
}
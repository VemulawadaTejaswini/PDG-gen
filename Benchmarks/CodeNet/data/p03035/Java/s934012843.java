import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
 
 
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int ans=0;
		if(A>=13){
			ans=B;
		}else if(A>=6){
			ans = B/2;
		}else{
			ans = 0;
		}
		
		System.out.println(ans);
		
		
	}
	
	
	
}
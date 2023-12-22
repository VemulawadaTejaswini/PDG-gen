import java.util.*;
import java.io.*;
 
public class Main{
    
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
		int X = s.nextInt();
		int Y = s.nextInt();
		boolean isTrue = false;
		for(int i = 0; i <= X; i++){
			if(Y == 2*(i)+4*(X-i)) isTrue = true;
		}
		if(isTrue){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
			
	}
} 
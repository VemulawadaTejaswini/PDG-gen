import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String S = keyboard.next();
		int z = 0;
		int o = 0;
		
		for(int s=0; s<S.length(); s++){
		if(S.charAt(s) == '0'){
				z++;
		}else{
		o++;		
		}
}
		
		System.out.println(2*Math.min(z,o));
		keyboard.close();	
		
	}
}

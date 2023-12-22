import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();
		
		List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int d = sc.nextInt();
			arr.add(d);
            }
			
			if(!arr.contains(X))
			{System.out.println(X);}
		else{
		for(int i = 0; i < 101; i++){
			if(!arr.contains(X-i))
			{System.out.println(X-i);break;}
		else if(!arr.contains(X+i))
			{System.out.println(X+i);break;}
		}
		
	
	}
}
}
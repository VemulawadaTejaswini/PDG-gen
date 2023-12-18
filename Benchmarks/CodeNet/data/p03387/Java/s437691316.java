import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;

public class Main{
	
	public static void main(String[] args) throws IOException{
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		Scanner in = new Scanner(System.in);
		
		int[] ABC = {in.nextInt(), in.nextInt(), in.nextInt()};
		Arrays.sort(ABC);
		int ans = 0;
		
		while(ABC[1] < ABC[2]){
			ABC[0]++;
			ABC[1]++;
			ans++;
		}
		
		while(ABC[0] <= ABC[2] - 2){
			ABC[0] += 2;
			ans++;
		}
		
		if(ABC[0] < ABC[2]) ans += 2;
		
		System.out.println(ans);
	}
}

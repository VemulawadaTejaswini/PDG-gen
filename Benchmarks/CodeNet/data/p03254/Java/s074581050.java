import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) throws ParseException{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
      	int x = sc.nextInt();
      	int as[] = new int[a];
      	int ans = 0;
      
      	for(int i = 0; i < a;i++){
          as[i] = sc.nextInt();
        }
      
      	Arrays.sort(as);
      
      	for(int i = 0; i < a && x > 0;i++){
          x -= as[i];
          if(x >= 0) ans++;
        }
      
      	if(ans == a && x > 0) ans--;
      
      	System.out.println(ans);
      	
        
	}
}
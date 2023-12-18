import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
      	int nam = 0;
      
      for(int i =0;i < n ;i++){
        int s = in.nextInt();
        int g = in.nextInt();
        nam +=  (g-s)+1;
      }
      System.out.print(nam);
	}
}
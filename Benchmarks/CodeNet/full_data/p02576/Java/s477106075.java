import java.util.*;
 
class Takoyaki{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int X = sc.nextInt();
      	int T = sc.nextInt();
      	sc.close();
      
      	int res = (int)Math.ceil(N/X);
      	System.out.println(res * T);
    }
}
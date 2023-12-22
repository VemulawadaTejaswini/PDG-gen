import java.util.*;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int T = sc.nextInt();
      
      if(N<=X){
		System.out.println(T);
		return;
       }
      
		int times = (int) Math.floor(N/X);
      
       if(N%X!=0){
		times++;
       }
		System.out.println(T*times);
		return;
	}

}

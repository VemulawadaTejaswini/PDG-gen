import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    	int D = sc.nextInt();
    	int T = sc.nextInt();
    	int S = sc.nextInt();
        double M = D/S;
      if(M<=T){
      	System.out.println("Yes");
      }else{
		System.out.println("No");
      }
      
    }
}
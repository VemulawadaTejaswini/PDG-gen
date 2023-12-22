import java.util.*;
public class Main{
 	public static void main(String[] args) {
 	    
		Scanner sc = new Scanner(System.in);
      	
      	int A = sc.nextInt();
      	int V = sc.nextInt();
      	int B = sc.nextInt();
      	int W = sc.nextInt();
      	int T = sc.nextInt();
      	int d=B-A;
      	int At=T*V;
      	int Bt=T*W;
      	int ans=At-Bt;
      	
      	if(ans>=d){
      	    
      	    System.out.println("YES");
      	    
      	}else{
      	    System.out.println("NO");
      	}
      	
 	}
}

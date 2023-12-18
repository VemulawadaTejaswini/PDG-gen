import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
 	int A = sc.nextInt();
 	int B = sc.nextInt();
	int sho = N/(A+B);
  	int amari = N%(A+B);
  	int ans=0;
  	if(A==0) System.out.print("0");
     
  	ans += sho * A;
  	if(amari<A){
     ans += amari; 
    }else{
      ans += A;
    }
  
	System.out.print(ans);
	}
}

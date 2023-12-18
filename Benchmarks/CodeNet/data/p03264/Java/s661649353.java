import java.util.*;
// cin=sc.nextInt();
// List<Integer> a = new ArrayList<Integer>(n);
 
public class Main {
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);	
		int a = sc.nextInt();
		if(a%2==0){
			a /=2;
			System.out.println(a*a);
		}
		else{
			a /= 2;
			System.out.println(a*(a+1));
		}
	}
}
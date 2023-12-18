import java.util.*;

public class Main {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<>();
		
		while(sc.hasNextInt()){
			a.add(sc.nextInt());
		}
		
		int x = 0;
		
		for(int i = 1; i < n-1; i+=2){
			
			int a_nm = a.get(i-1);
			int a_n = a.get(i);
			int a_np = a.get(i+1);
			
			if(a_nm==a_n && a_n==a_np){
				x++;
			}
			else if(a_nm==a_n){
				x++;
			}
          	else if(a_n==a_np){
				x++;
			}
		}
      
      	if(a.get(n-2)==a.get(n-1)&&n%2==0){
        	x++;
        }
      
		System.out.print(x);	
	}
}
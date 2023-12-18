import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
 		int as[] = new int[n];
      	int haf = n/2;
      	if(n % 2 != 0) haf++;
      
      	for(int i = 0;i < n; i++){
          as[i] = sc.nextInt();
        }
      
      	for(int i = 0;i < haf; i++){
          System.out.print(as[n-1 - 2*i] + " ");
        }
      
      	for(int i = 0;i < n/2; i++){
          System.out.print(as[n-(n/2+1)+2*i] + " ");
        }
     
      	System.out.println();
        
	}
}

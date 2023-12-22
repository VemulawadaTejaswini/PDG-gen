import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
      	int y = sc.nextInt();
      	int p =1;
      
      	for(int i=0; i<x+1; i++){         
          int u =i*2 + (x-i)*4;
          if(u==y){
            System.out.print("Yes");
            p =0;
            break;
          }
        }
        
      	if(p==1){
        	System.out.print("No");
        }
       
      
	}
}
import java.util.*;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);		
		int N = in.nextInt();
      	int mo[] = new int[N+1];
        int yu[] = new int[N];
        int sum = 0;
      
      for(int i = 0; i<N+1; i++ ){mo[i] = in.nextInt();}
      for(int i = 0; i<N; i++ ){yu[i] = in.nextInt();}
      
      for(int i = 0; i<N; i++){
		if(yu[i]>mo[i]){
          sum +=mo[i];
          yu[i] -= mo[i]; 
            if(yu[i]>mo[i+1]){sum +=mo[i+1];}
            else{sum +=yu[i];}
        }
        else{sum +=yu[i];}
        
      }
      System.out.print(sum);
        
      }
	}
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
      
      	int ns[] = new int[n];
      	int nc = 0;
      	boolean edge;
      
      	for(int i = 0; i < n; i++) ns[i] = sc.nextInt();
      
      	for(int i = 0; i < n;i++){
          edge = true;
          for(int j = 0; j < i && edge; j++){
            if(ns[i] > ns[j]) {
              nc++;
              edge = false;
            }
          }
        }
		
      	System.out.println(n - nc);
        
	}
}
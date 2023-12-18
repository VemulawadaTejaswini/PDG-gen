import java.util.Scanner;

public class Main{

	public static void main(String args[]){
    	
      	Scanner sc = new Scanner(System.in);
        int n, l;
      	
      	String ary[] = new String[n];
        
		n = sc.nextInt();
      	l = sc.nextInt();
      
      	for(int i=0; i<n; i++){
        	ary[i] = sc.next();
        }
      
      	Arrays.sort(ary);
      
      	String answer = "";
      	for(int j=0; j<n; j++){
        	answer += ary[i];
        }
      
      	System.out.println(answer);
        
    }
}
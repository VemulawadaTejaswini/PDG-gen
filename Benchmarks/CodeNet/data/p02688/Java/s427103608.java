import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int k =sc.nextInt();
    int[]s = new int[n];
    
    for(int i=0; i<k; i++) {
    	int d = sc.nextInt();
    	for(int j=0; j<d; j++) {
    		int a = sc.nextInt();
    			s[a-1]++; 
    	}	
    }
    int cou = 0;
    for(int i=0; i<n; i++) {
    	if(s[i]==0) {
    		cou++;
    	}
    }
    System.out.println(cou);
    }
}

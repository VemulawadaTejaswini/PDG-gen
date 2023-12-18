import java.util.*;
class Main {
	public static void main(String[]args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		String []a = new String[n];
		String []b = new String[m];
		for(int i=0;i<n;i++){
			a[i]=stdIn.next();
		}
		for(int i=0;i<m;i++){
			a[i]=stdIn.next();
		}
			
		if(b[m].indexOf(a[n])!=-1){
			System.out.println("Yes");
		}
		if(b[m].indexOf(a[n])==-1)
		    System.out.println("No");
		
		
		
	}
}

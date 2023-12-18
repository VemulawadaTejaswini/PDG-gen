import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int [n];
		int [] count = new int[n + 1];
		boolean s = true;
		for(int i = 0; i < n; i++){ a[i] = sc.nextInt(); }
		
		for(int i = 0; i < n; i++){ count[a[i]] ++; }
		
		if(n % 2 == 0){
		for(int i = 1; i <= n; i += 2){ if(count[i] != 2){ s = false; }}
		for(int i = 2; i <= n; i += 2){ if(count[i] != 0){ s = false; }}		
		}
		else{ 
		for(int i = 2; i <= n; i += 2){ if(count[i] != 2){ s = false; }}
		for(int i = 1; i <= n; i += 2){ if(count[i] != 0){ s = false; }}			
		if(count[0] != 1){ s = false; }
		}
		
		if(s){System.out.println((int)Math.pow(2,n / 2));}
		else{System.out.println(0);}
	}}
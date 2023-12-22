import java.util.*;
public class Main {
	
	static void print(char[] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]);
			if(i == a.length-1) System.out.print(" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(sc.hasNext()){
			String word = sc.next();
			if(word.equals("")) break;
			char[] a = word.toCharArray();
			if(a.length<5){print(a); continue;}
			if(a[0]=='a' && a[1]=='p' && a[2]=='p' && a[3]=='l' && a[4]=='e')
				{a[0] = 'p'; a[1] = 'e'; a[2] = 'a'; a[3] = 'c'; a[4] = 'h';} 
			else if(a[0]=='p' && a[1]=='e' && a[2]=='a' && a[3]=='c' && a[4]=='h')
				{a[0] = 'a'; a[1] = 'p'; a[2] = 'p'; a[3] = 'l'; a[4] = 'e';}
			
			print(a);

		}
	}

}
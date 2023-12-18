import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		
		int x = 0;
		int max = x;
		
		
		char[] s = new char [N];
		s = scan.next().toCharArray();
		
		for(int i = 0;i<N;i++){
			if(s[i]=='I'){
				x+=1;
				if(max<x){
					max=x;
				}
				
			}
			
			if(s[i]=='D'){
				x-=1;
				
			}
			
		}
		
		
		
		System.out.println(max);
		
		
	}

}

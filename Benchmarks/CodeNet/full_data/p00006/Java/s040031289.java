import java.util.*;


public class Main {
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System. in);
		String line = sc.nextLine();
		char[] str = line.toCharArray();
		int n = line.length();
				
		char[] rts = new char[20];
		
		for(int i=0;i<n;i++){
			rts[i]=str[n-i-1];
		}
		
		for(int i=0;i<n;i++){
		System.out.print(rts[i]);
		}
		System.out.println();
	}
}



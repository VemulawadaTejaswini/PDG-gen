import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			char[] c = sc.next().toCharArray();
			int count = 0;
			int n = c.length;
			for(int i=0;i<n/2;i++){
				if((c[i]=='i' && c[n-1-i]!='i') || (c[i]=='w' && c[n-1-i]!='w')
						|| (c[i]=='(' && c[n-1-i]!=')') || (c[i]==')' && c[n-1-i]!='(')) count++;
			}
			if(n%2==1 && c[n/2]!='w' && c[n/2]!='i') count++;
			System.out.println(count);
		}
	}	
}
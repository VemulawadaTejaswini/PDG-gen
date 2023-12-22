import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			String[] s = new String[n];
			int[] m = new int[n];
			
			for(int i=0;i<n;i++){
				s[i] = sc.next();
				m[i] = sc.nextInt();
			}
			
			int a = 0;
			for(int i=0;i<n;i++){
				if(s[i].codePointAt(0)==40){
					a += m[i];
				}else{
					a -= m[i];
				}
				if(a<0){
					break;
				}
			}
			if(a==0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
		}
	
	}	
}
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			
			int[] m = new int[100001];
			int a, b;
			for(int i=0;i<n;i++){
				a = sc.nextInt()-1;
				b = sc.nextInt()-1;
				for(int j=a;j<=b;j++) m[j]++;
			}
			
			boolean flag = false;
			for(int i=n-1;i>=0;i--){
				if(m[i]==n){
					System.out.println(i);
					flag = true;
					break;
				}
			}
			if(flag==false) System.out.println(0);
		}	
	}	
}
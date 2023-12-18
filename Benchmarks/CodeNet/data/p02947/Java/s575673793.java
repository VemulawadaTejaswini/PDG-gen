import java.util.*;	
public class Main {
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		String[] s=new String[N];
		String[] sorts=new String[N];
		String[][] splits=new String[N][10];
		
		long count=0;
		for(int i=0; i<N; i++) {
			s[i]=sc.next();
			splits[i]=s[i].split("");
			Arrays.sort(splits[i]);
			for(int j=0; j<5; j++) {
				sorts[i]+=splits[i][j];
			}
			
		}
		Arrays.sort(sorts);
		for(int i=0;i<N;i++) {
			for(int j=i+1; j<N; j++) {
			if(sorts[i].equals(sorts[j])) {
					count++;
			}		
				}			
			
		}
		System.out.println(count);
	  }	          	
}
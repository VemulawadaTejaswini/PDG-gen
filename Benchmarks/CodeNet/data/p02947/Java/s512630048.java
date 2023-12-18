import java.util.*;	
public class Main {
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		String[] s=new String[N];
		String[][] splits=new String[N][10];
		long count=0;
		for(int i=0; i<N; i++) {
			s[i]=sc.next();
			splits[i]=s[i].split("");
			Arrays.sort(splits[i]);
		}
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				if(Arrays.equals(splits[i], splits[j])) {
					count++;
				}
				
			}
		}
		System.out.println(count);
	  }	          	
}
import java.util.Scanner;

public class Main {
	
	static int[] v=new int[8000000];
	
	static void visit(int num) {
		for(int i=1; i*num<8000000; i++) {
			v[num*i]=1;
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int m=sc.nextInt();
				int n=sc.nextInt();
				if(m+n==0) {
					break;
				}
				for(int i=0; i<n; i++) {
					if(v[m+i]==0) {
						visit(m+i);
					}
					else {
						for(int j=i; ; j++) {
							if(v[j]==0) {
								visit(j);
								break;
							}
						}
					}
				}
				for(int i=m; i<8000000; i++) {
					if(v[i]==0) {
						System.out.println(i);
						break;
					}
				}
			}
			

		}
	}
}

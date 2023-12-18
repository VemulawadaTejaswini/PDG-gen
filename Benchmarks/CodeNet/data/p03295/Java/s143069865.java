import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static class Islands implements Comparable<Islands>{
		int a, b;
		public Islands(int a, int b) {
			this.a=a;
			this.b=b;
		}
		
		public int compareTo(Islands s) {
			return (this.b==s.b)? this.a-s.a:this.b-s.b;
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		Islands[] land=new Islands[M];
		for(int i=0; i<M; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			land[i]=new Islands(a, b);
		}
		Arrays.sort(land);
		int last=0, count=0;
		
		for(int i=0; i<M; i++) {
			if(land[i].a>last) {
				last=land[i].b-1;
				count++;
			}
		}
		
		System.out.println(count);
		
		
		sc.close();
	}	
}
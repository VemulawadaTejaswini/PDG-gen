import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		Reader reader=new Reader();
		int t=1;//sc.nextInt();
		while(t-->0) {
			int n=reader.nextInt();
			int[] arr=reader.intArray();
			int g=arr[0];
			for(int i=0;i<n;i++) {
				g=gcd(g,arr[i]);
			}
			if(g>1) {
				System.out.println("not coprime");
				continue;
			}
			HashSet<Integer> out=new HashSet<>();
			for(int i:arr) {
				HashSet<Integer> in=new HashSet<>();
				int f=2;
				for(f=2;f*f<=i;f+=2) {
					while(i%f==0) {
						i/=f;
						in.add(f);
						/*if(f!=2) in.add(f);
						else out.add(f);*/
					}
				}
				if(i>1) in.add(f);
				for(int iel:in) {
					if(out.contains(iel)) {
						System.out.println("setwise coprime");
						return;
					}
				}
				out.addAll(in);
			}
			System.out.println("pairwise coprime");
		}
	}
	static int gcd(int a,int b) {
		if(a==0) return b;
		return gcd(b%a,a);
	}
}
class Reader{
	BufferedReader reader;
	Reader(){
		reader=new BufferedReader(new InputStreamReader(System.in));
	}
	int nextInt() throws IOException{
		String in=reader.readLine().trim();
		return Integer.parseInt(in);
	}
	long nextLong() throws IOException{
		String in=reader.readLine().trim();
		return Long.parseLong(in);
	}
	String next() throws IOException{
		return reader.readLine().trim();
	}
	String[] stringArray() throws IOException{
		return reader.readLine().trim().split("\\s+");
	}
	int[] intArray() throws IOException{
		String[] inp=this.stringArray();
		int[] arr=new int[inp.length];
		int i=0;
		for(String s:inp) {
			arr[i++]=Integer.parseInt(s);
		}
		return arr;
	}
}

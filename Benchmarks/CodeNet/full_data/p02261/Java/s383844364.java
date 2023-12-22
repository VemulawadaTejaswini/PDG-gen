import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		List<String> A=new ArrayList<>();
		 
		for(int i=0;i<n;i++)A.add(in.next());
		List<String> B=new ArrayList<>(A),S=new ArrayList<>(A);
		
		in.close();
		
		bubble(B);
		for(int i=0;i<n-1;i++)System.out.print(B.get(i)+" ");
		System.out.println(B.get(n-1));
		System.out.println("Stable");
		
		selection(S);
		for(int i=0;i<n-1;i++)System.out.print(S.get(i)+" ");
		System.out.println(S.get(n-1));
		System.out.println((isStable(S,B))? "Stable": "Not stable");
	}
	
	static boolean isStable(List<String> A,List<String> B) {
		for(int i=0;i<A.size();i++) {
			if(!A.get(i).equals(B.get(i)))return false;
		}
		
		return true;
	}
	
	static void bubble(List<String> A) {
		boolean f=true;
		
		while(f) {
			f=false;
			for(int i=A.size()-1;i>0;i--) {
				if(A.get(i).charAt(1)<A.get(i-1).charAt(1)) {
					Collections.swap(A, i, i-1);
					f=true;
				}
			}
		}
	}
	
	static void selection(List<String> A) {
		
		for(int i=0;i<A.size();i++) {
			int min=i;
			for(int j=i;j<A.size();j++) {
				if(A.get(j).charAt(1)<A.get(min).charAt(1))min=j;
			}
			
			if(min>i) {
				Collections.swap(A, i, min);
			}
			
		}
		
	}

}


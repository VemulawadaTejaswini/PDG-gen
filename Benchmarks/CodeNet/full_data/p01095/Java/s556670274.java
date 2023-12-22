import java.util.*;
public class Main {
	static int MAX=7368792;
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			int m=in.nextInt(),n=in.nextInt();
			if(m==0)break;
			List<Integer> list=getSeed(m,n);

			
			int res=0;
			boolean A[]=new boolean[MAX];
			for(int i=0;i<list.size();i++) {
				//int g=list[i];
				int g=list.get(i);
				for(int j=g;j<MAX;j+=g)A[j]=true;
			}
			for(int i=m;i<MAX;i++) {
				if(!A[i]) {
					res=i;
					break;
				}
			}
			System.out.println(res);
		}
	}
	
	static List<Integer> getSeed(int m,int n){
		
		boolean list[]=new boolean[MAX];
		for(int i=m;i<(MAX);i++) {
			if(!list[i]) {
				for(int j=i*2;j<MAX;j+=i)list[j]=true;
			}
		}
		List<Integer> res=new ArrayList<>();
		int i=m;
		while(res.size()<n) {
			if(!list[i]) {
				res.add(i);
			}
			i++;
		}
		return res;
	}

}


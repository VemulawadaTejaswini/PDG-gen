import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n;
		List<Integer> dat=new ArrayList<Integer>();
		while(true){
			int ans=0;
			n=scn.nextInt();
			if(n==0)break;

			for(int i=n+1;i<=2*n;i++){
				for(int j=2;j<=i;j++){
					if(j>=i/2){
						ans++;
						break;
					}
					if(i%j==0)break;
				}
			}
			dat.add(ans);
		}
		System.out.println();
		for(int i=0;i<dat.size();i++){
			System.out.println(dat.get(i));
		}
	}
}
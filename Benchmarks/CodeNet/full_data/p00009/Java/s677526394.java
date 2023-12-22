import java.util.*;
class Main {
	static final int max=1000000;
	public static void main(String[] args) {
		boolean p[]=new boolean[max+1];
		for(int i=0;i<max;i++)p[i]=true;
		p[0]=false;p[1]=false;
		for(int t=2;t<max;t++){
			if(p[t]){
				for(int i=t*2;i<max;i+=t){
					p[i]=false;
				}
			}
		}
		Scanner n = new Scanner(System.in);
		while(true){
			int in = n.nextInt();
			if(in==0)break;
			int cnt=0;
			for(int i=2;i<=in;i++){
				if(p[i])cnt++;
			}
			System.out.println(cnt);
		}
	}
}
import java.util.*;
import java.util.Map.Entry;

class Main {
	Scanner sc = new Scanner(System.in);

	public int des(int count,int index){
		if(count==n){
			int _s=0;
			for(int i=0;i<10;i++){
				if(use[i])_s+=i;
			}
			return (s==_s)?1:0;
		}
		int sum=0;
		for(int i=index;i<10;i++){
			if(!use[i]){
				use[i]=true;
				sum+=des(count+1,i+1);
				use[i]=false;
			}
		}
		return sum;
	}
	
	int n,s;
	boolean[] use=new boolean[10];
	public void run() {
		while(true){
			n=sc.nextInt();
			s=sc.nextInt();
			if(n==0 && s==0)break;
			ln(des(0,0));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Long> unko=new ArrayList<Long>();
		int unko2=sc.nextInt();
		fra(unko2,unko);
		int[] Ns=new int[32];
		int cnt=0;
		for(int i=0; i<unko.size(); i++) {
			long tmp=unko.get(i);
			if(tmp>1) {
				Ns[cnt]=(int)tmp;
				cnt++;
			}
		}
		int[] kai=new int[cnt];
		for(int i=0; i<cnt; i++) {
			kai[i]=Ns[i];
		}
		Arrays.sort(kai);
		String buri="";
		buri=buri+unko2+": ";
		for(int i=0; i<cnt-1; i++) {
			buri=buri+kai[i]+" ";
		}
		buri=buri+kai[cnt-1];
		System.out.println(buri);
	}
	public static void fra(int a,List<Integer> p) {//int型用
		for(int i=2; i*i<=a; i++) {
			if(a%i==0) {
				p.add(i);
				fra(a/i,p);
				return;
			}
		}
		p.add(a);
	}

	public static void fra(long a,List<Long> p) {//long型用
		for(long i=2; i*i<=a; i++) {
			if(a%i==0) {
				p.add(i);
				fra(a/i,p);
				return;
			}
		}
		p.add(a);
	}

}

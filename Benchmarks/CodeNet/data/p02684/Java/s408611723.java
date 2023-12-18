//20200510 D
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long K=sc.nextLong();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt()-1;
		}
		List<Integer> Q=new LinkedList<>();
		Q.add(0);
		int ls;
		int le;
		int lsn;
		int len;
		while(true){
			int a=A[Q.get(Q.size()-1)];
			if(Q.contains(a)){
				ls=a;
				lsn=Q.indexOf(a);
				le=Q.get(Q.size()-1);
				len=Q.size()-1;
				break;
			}
			Q.add(a);
		}
      	/*for(Integer i:Q){
          System.out.println(i);
        }
      	System.out.println(lsn);
      	System.out.println(len);
      	System.out.println("");*/
		if(K<lsn){
			System.out.println(Q.get((int)K)+1);
		}else{
			int n=(int)((K-lsn)%(len-lsn+1))+lsn;
			System.out.println(Q.get(n)+1);
		}
	}
}

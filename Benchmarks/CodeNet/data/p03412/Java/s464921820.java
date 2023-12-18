import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		int A[] = new int[N];
		int B[] = new int[N];

		for(int n=0;n<N;n++){
			A[n] = sc.nextInt();
		}

		for(int n=0;n<N;n++){
			B[n] = sc.nextInt();
		}

		ArrayList<Integer> ts = new ArrayList<Integer>();
		for(int n=0;n<N;n++){
			for(int m=0;m<N;m++){
				int ad = A[n]+B[m];
				if(ts.indexOf(ad)==-1) ts.add(ad);
				else ts.remove(ts.indexOf(ad));
			}
		}

		int st[] = new int[28];
		for(int n=0;n<28;n++) st[n] = 0;

		for(int t=0;t<ts.size();t++){
			String s = Integer.toBinaryString(ts.get(t));
			int v[] = new int[s.length()];
			for(int n=v.length-1;n>=0;n--){
				v[n] = s.charAt(n)-'0';
			}
			for(int n=28-v.length,tms=0;n<28;n++,tms++){
				st[n] = (st[n] + v[tms])%2;
			}
		}

		String ans="";

		for(int n=0;n<28;n++){
			ans += String.valueOf(st[n]);
		}
		System.out.println(Integer.parseInt(ans,2));
	}

}
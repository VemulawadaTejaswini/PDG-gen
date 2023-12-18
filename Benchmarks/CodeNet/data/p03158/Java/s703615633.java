import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextLong();
		long q = Long.parseLong(sc.next());
		List<Long> list = new ArrayList<>();

		for(long i=0;i<n;i++){
			list.add(Long.parseLong(sc.next()));
		}

		
		Map<Long, Long> resultMemo = new HashMap<>();

		for(long j=0; j<q;j++){
			long x = Long.parseLong(sc.next());
			long result = 0;

			long maxTry = n-n/2;
			long preDownBorder =0;
			for(long i=1;i<=maxTry;i++){
				long upBorder =preDownBorder-1;
				if(i==1){
					upBorder = list.get((int)(n-1));
				}

				long downBorder =0;
				if(n-n/2 ==i){
					downBorder =1;
				}else{
					long tmpSUm = list.get((int)(n-2*i-1)) + list.get((int)(n-i-1));
					if(tmpSUm%2==0){
						downBorder=tmpSUm/2+1;
					}else{
						downBorder=tmpSUm/2;
					}
				}
				preDownBorder = downBorder;
				//判定条件おわり

				if(downBorder <= x && x <= upBorder){
					result=calcResult(i,list,n);
				}else{
					continue;
				}
			}
			
			System.out.println(result);
			//xのループが終わり
		}


	}


	static long calcResult(long i,List<Long> list,long n) {
		long sum=0;
		
		for(long k=0;k<n;k++){
			sum += list.get(k);
			k++;
		}

		return sum;
		}
}
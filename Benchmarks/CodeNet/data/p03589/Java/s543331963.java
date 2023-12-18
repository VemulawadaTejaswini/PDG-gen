import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long h = 0L;
		long n = 0L;
		long w = 0L;
		for(long i=1L; i<=N*3/4; i++){
			for(long j=1L; j<=3500; j++){
				if(4*i*j-N*i-N*j>0 && (N*i*j)%(4*i*j-N*i-N*j)==0){
					h = i;
					n = (N*i*j) / (4*i*j-N*i-N*j);
					w = j;
					break;
				}
			if(h!=0)break;
			}
		}
		System.out.println(h + " " + n + " " + w);
	}
}
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long nn = sc.nextLong();
		long tmp=0;
		long min_num = nn;
		
		for(long i=2;i<=Math.sqrt(nn);i++){
			if(nn%i==0){
				tmp = (long)nn/i;
				if((tmp+i)<min_num){
					min_num = tmp+i;
				}
			}
		}
		
		if(tmp==0){
			System.out.print(nn-1);
		}else{
			System.out.print(min_num-2);
		}
	}	
}
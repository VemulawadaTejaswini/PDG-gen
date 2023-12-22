import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//Seven Puzzle
public class Main{

	static int[] pow = {1,10,100,1000,10000,100000,1000000,10000000};
	
	static int swap(int x, int k){
		int pos = 0;
//		System.out.println("X:" + x + " K:" + k);
		while((x/pow[pos])%10>0){
			pos++;
		}
//		System.out.println("POS: " + pos);
		int tp = 0;
		if(k==0){
			if(pos+4>7)return 0;
			tp = pos+4;
		}
		else if(k==1){
			if((pos+1)%4==0)return 0;
			tp = pos+1;
		}
		else if(k==2){
			if(pos-4<0)return 0;
			tp = pos-4;
		}
		else if(k==3){
			if(pos%4==0)return 0;
			tp = pos-1;
		}
		int d = x/pow[tp]%10;
//		System.out.println("RESULT:" + (x - d*pow[tp] + d*pow[pos]));
		return x - d*pow[tp] + d*pow[pos];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int x = 0;
			for(int i=0;i<2;i++)for(int j=0;j<4;j++){
				x*=10;
				x+=sc.nextInt();
			}
			Set<Integer> set = new HashSet<Integer>();
			set.add(x);
			List<Integer> l = new ArrayList<Integer>();
			l.add(x);
			int step = 0;
			while(!l.isEmpty()){
				List<Integer> next = new ArrayList<Integer>();
				for(int a:l){
					if(a==1234567){
						next.clear();
						System.out.println(step);
						break;
					}
					for(int k=0;k<4;k++){
						int n = swap(a, k);
						if(n!=0 && !set.contains(n)){
							set.add(n);
							next.add(n);
						}
					}
				}
				step++;
				l = next;
			}
		}
	}
}
import java.util.Scanner;
import java.math.BigDecimal;

public class Main{
	public Main(){
		int l = 0, pr = 0;
		int[] pri = new int[10000];
		Scanner sc = new Scanner(System.in);
		String[] id = new String[10000];
		BigDecimal[] bl = new BigDecimal[10000];
		String max = "";
		BigDecimal ma = new BigDecimal("0");
		
		for(int i = 0; i < 10000; i++){
			pri[i] = 0;
		}
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			pr++;
			if(n == 0){
				System.out.println("NA");
				break;
			}
			for(int k = 0, f = 0; k < n; k++, f=0){
				String str = sc.next();
				BigDecimal bd = new BigDecimal(sc.next());
				bd = bd.multiply(new BigDecimal(sc.next()));
				for(int i = 0; i < l; i++){
					if(id[i].equals(str) && pri[i] < pr){
						bl[i] = bd;
						f = 1;
					}
				}
				if(f == 0){
					id[l] = str;
					bl[l] = bd;
					pri[l] = pr;
					l++;
				}
			}
			max = id[0];
			ma = bl[0];
			for(int i = 1; i < l; i++){
				if(ma.compareTo(bl[i]) == -1){
					max = id[i];
					ma = bl[i];
				}
			}
			
			System.out.println(max);
		}
	}
	
	public static void main(String[] args){
		new Main();
	}
}
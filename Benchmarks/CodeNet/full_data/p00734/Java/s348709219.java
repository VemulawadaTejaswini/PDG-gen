import java.util.*;
import java.text.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			int m = in.nextInt();
			int sumn = 0;
			int summ = 0;
			if((n|m)==0) break;
			int[] nlist = new int[n];
			int[] mlist = new int[m];
			for(int i=0; i<n; i++){
				nlist[i] = in.nextInt();
				sumn += nlist[i];
			}
			for(int i=0; i<m; i++){
				mlist[i] = in.nextInt();
				summ += mlist[i];
			}
			if((sumn-summ)%2!=0){
				System.out.println("-1");
			}else{
				boolean find = false;
				int changei = Integer.MAX_VALUE;
				int changej = Integer.MAX_VALUE;
				for(int i=0; i<n; i++){
					for(int j=0; j<m; j++){
						if((nlist[i]-mlist[j])*2==sumn-summ){
							changei = i;
							changej = j;
							find = true;
						}
					}
					if(find) break;
				}
				if((changei|changej)==Integer.MAX_VALUE){
					System.out.println("-1");
				}else{
					System.out.println(nlist[changei]+" "+mlist[changej]);
				}				
			}
		}
	}
}
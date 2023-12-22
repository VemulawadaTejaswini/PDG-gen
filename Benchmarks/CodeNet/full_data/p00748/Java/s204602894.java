import java.util.ArrayList;
import java.util.Scanner;

public class Main2010C {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] pol = new int[1000000];
		ArrayList<Integer> p1 = new ArrayList<>();
		int[] pol_odd = new int[1000000];
		ArrayList<Integer> p1_odd = new ArrayList<>();
		
		int num = 1;
		for(int i=1;num<1000000;i++){
			p1.add(num);
			if((num&1)==1){
				p1_odd.add(num);
			}
			num = num * (i+3) / i;
		}
		
		for(int i=1;i<1000000;i++){
			int min = Integer.MAX_VALUE;
			for(int j=0;j<p1.size();j++){
				if(i-p1.get(j)<0) break;
				min = Math.min(min,pol[i-p1.get(j)]);
			}
			pol[i] = min + 1;
			
			min = Integer.MAX_VALUE;
			for(int j=0;j<p1_odd.size();j++){
				if(i-p1_odd.get(j)<0) break;
				min = Math.min(min,pol_odd[i-p1_odd.get(j)]);
			}
			pol_odd[i] = min + 1;
		}
		
		while(true){
			int x = in.nextInt();
			if(x==0) break;
			else{
				System.out.println(pol[x]+" "+pol_odd[x]);
			}
		}
	}	
}
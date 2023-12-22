import java.util.*;
import java.math.*;
import java.text.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			int p = in.nextInt();
			if((n|p)==0) break;
			int[] counts = new int[n];
			Arrays.fill(counts, 0);
			int cup = p;
			for(int i=0;;i=(i+1)%n){
				if(cup==0){
					cup = counts[i];
					counts[i] = 0;
				}else{
					cup--;
					counts[i]++;
					if(counts[i]==p){
						System.out.println(i);
						break;
					}
				}
			}
		}
	}
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{
	static ArrayList<Integer> fract;
	public static void main(String[] args) {
		fract=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			int a=sc.nextInt();
			if(a==1) {
				System.exit(0);
			}
			else {
				fract.clear();
				frac(a);
				StringBuilder sb=new StringBuilder();
				sb.append(a);
				sb.append(": ");
				Collections.sort(fract);
				for(int i=0; i<fract.size()-1; i++) {
					sb.append(fract.get(i)+" ");
				}
				sb.append(fract.get(fract.size()-1));
				System.out.println(sb.toString());
			}
		}
	}
	public static void frac(int num) {
		for(int i=0; i<=600000; i++) {
			int wari=0;
			if(i%2==0) {
				wari=((i+1)/2*7)+1;
			}
			else {
				wari=((i+1)/2*7)-1;
			}

			if(wari!=1 && num%wari==0 && ismfp(wari)) {
				fract.add(wari);
			}
		}
	}
	public static boolean ismfp(int num) {
		int tmp=6;
		int[] add= {2,5};
		int counter=0;
		while(tmp*tmp<=num) {
			if(num%tmp==0 && (((num/tmp)%7==1) ||((num/tmp)%7==6))){
				return false;
			}
			tmp+=add[counter%2];
			counter++;
		}
		return true;
	}
}

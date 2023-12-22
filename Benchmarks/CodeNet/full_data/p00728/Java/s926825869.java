import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		ArrayList<Integer> result= new ArrayList<Integer>();
		ArrayList<Integer> s_set=new ArrayList<Integer>();
		int n=in.nextInt();
		int sum=0;
		int ave;
		int mintmp=1001;
		int maxtmp=-1;
		while (n!=0) {
			for (int i=0;i<n;i++) {
				s_set.add(in.nextInt());
				sum+=s_set.get(i);
				if (mintmp > s_set.get(i)) {
					mintmp=s_set.get(i);
				}
				if (maxtmp < s_set.get(i)) {
					maxtmp=s_set.get(i);
				}
			}
			sum-=maxtmp+mintmp;
			ave=sum/(n-2);
			result.add(ave);

			n=in.nextInt();
			mintmp=1001;
			maxtmp=-1;
			sum=0;
			s_set.clear();
		}

		for (int i=0;i<result.size();i++) {
			System.out.printf("%d%n",result.get(i));
		}
	}
}
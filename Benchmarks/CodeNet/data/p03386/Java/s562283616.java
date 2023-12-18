import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min=sc.nextInt();
		int max=sc.nextInt();
		int tmp=sc.nextInt();
		int bg = tmp;
		if(tmp>max-min){
			bg=max-min;
		}
if(max==min) {
			bg=1;
		}
		int mn = tmp;
		if(mn>max-min) {
			mn=max-min;
		}
		int big[] = new int[bg];
		int small[] = new int[mn];
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<bg;i++) {
			big[i]=min+i;
			list.add(big[i]);
		}
		for(int i=0;i<mn;i++) {
			small[mn-1-i]=max-i;
		}
		ch:for(int i=0;i<mn;i++) {
			for(int j=0;j<list.size();j++) {
				if(small[i]==list.get(j)) {
					continue ch;
				}
			}
			list.add(small[i]);
		}
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
import java.util.ArrayList;
import java.util.Scanner;


class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		int n=cin.nextInt(),max,min,sum=0;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			int x=cin.nextInt();
			list.add(x);
		}
		
		max=list.get(0);min=list.get(0);sum+=list.get(0);
		
		for(int i=1;i<list.size();i++){
			int t=list.get(i);
			max=Math.max(max, t);
			min=Math.min(min, t);
			sum+=t;
		}
		
		System.out.printf("%d %d %d\n", min,max,sum);
	}

}


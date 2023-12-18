import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int n;
	static int[] m;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		n=sc.nextInt();
		m=new int[n];
		ArrayList<Integer> num=new ArrayList<>();
		ArrayList<Integer> num2=new ArrayList<>();
		int ans=0;

		for (int i = 0; i < n; i++) {
			m[i]=sc.nextInt();
			if(i%2==0 &&!num2.contains(m[i])) num2.add(m[i]);
			else if(i%2==1 && !num.contains(m[i])) num.add(m[i]);
		}

		if(num.size()==1 && num2.size()==1 && num.get(0)==num2.get(0)) {
			System.out.println(n/2);
			System.exit(1);	
		}

		for (int i = 0; i < n; i++) 
			if(i%2==0 && m[i]!= num2.get(max(num2))|| i%2!=0 && m[i]!= num.get(max(num))) ans++;

		System.out.println(ans);
	}

	public static int max(ArrayList<Integer> num) {
		int a=0,ans=0;
		for (int i = 0; i < num.size(); i++) 
			for (int j=0; j<n; j++) {
				int c=0;
				if(num.get(i)==m[j]) c++;
				if(a<c) {
					a=c;
					ans=i; 
					break;
				}
			}
		return ans;
	}
}
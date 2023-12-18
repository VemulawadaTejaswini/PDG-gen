import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt(),q=sc.nextInt();
		char[] str = sc.next().toCharArray();
		int[] flag = new int[n];
		int count = 0;
		for(int i=0;i<n-1;i++) {
			if(str[i]=='A' &&  str[i+1]=='C') count++;
			flag[i]=count;
		}
      	flag[n-1]=count;
		for(int i=0;i<q;i++) {
			int l = sc.nextInt()-1, r = sc.nextInt()-1, ans;
			ans=flag[r-1]-flag[l];
			System.out.println(ans);
		}
	}
}
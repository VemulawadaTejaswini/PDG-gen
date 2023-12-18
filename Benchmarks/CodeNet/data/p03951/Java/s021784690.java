import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next(),t=sc.next(),res=s;
		boolean flag=false;
		for(int i=0;i<n;i++) {
			if(s.substring(i, n).equals(t.substring(0, n-i))) {
				res+=t.subSequence(n-i, n);
				flag=true;
			}
		}
		if(flag) {
			System.out.println(res.length());
		}else {
			System.out.println(n*2);
		}
	}
}

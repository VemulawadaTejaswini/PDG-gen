import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();

		int answer=0;
		for(int i=0;i<n;i++) {
			if(onaji(s, n, i)>answer) {
				answer=onaji(s, n, i);
			}
		}

		System.out.print(answer);

	}

	public static int onaji(String s, int n, int a) {
		int kaesu=0;
		for(int i=0;i<a;i++){

			boolean modoru=true;
			for(int j=0;j<i;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					modoru=false;
					break;
				}
			}
			if(modoru) {
				for(int j=a;j<n;j++) {
					if(s.charAt(i)==s.charAt(j)) {
						kaesu++;
						break;
					}
				}
			}
		}

		return kaesu;

	}

}

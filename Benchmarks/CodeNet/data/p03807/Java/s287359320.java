import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int c=0;
			for(int i=0;i<n;i++) if(sc.nextInt()%2==1) c++;
			if(c%2==1) System.out.println("NO");
			else System.out.println("YES");
		}
	}
}
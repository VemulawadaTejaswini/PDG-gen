import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		String s=sc.next();
		char[] ch=s.toCharArray();
		int[] ret=new int[Q];
		for(int i=0;i<Q;i++){
			int counter=0;
			int a=sc.nextInt();
			int b=sc.nextInt();
			for(int j=a;j<b&&j<N;j++){
				if(ch[j-1]=='A'&&ch[j]=='C')counter++;
			}
			ret[i]=counter;
		}
		for(int i=0;i<ret.length;i++)System.out.println(ret[i]);
		sc.close();
	}
}
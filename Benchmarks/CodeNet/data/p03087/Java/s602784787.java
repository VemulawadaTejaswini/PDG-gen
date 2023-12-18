import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		String s=sc.next();
		int[][] v=new int[Q][2];
		for(int i=0;i<Q;i++){
			v[i][0]=sc.nextInt();
			v[i][1]=sc.nextInt();
		}
		sc.close();
		char[] ch=s.toCharArray();
		for(int i=0;i<Q;i++){
			System.out.println(proc(ch,v[i][0],v[i][1]));
		}
	}

	private static int proc(char[] ch,int a,int b){
		int counter=0;
		for(int i=a;i<b&&i<ch.length;i++){
			if(ch[i-1]=='A'&&ch[i]=='C')counter++;
		}
		return counter;
	}
}
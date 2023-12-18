
import java.util.Scanner;

class Main2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int Q=sc.nextInt();
		String s=sc.next();
		char[] ch=s.toCharArray();
		for(int i=0;i<Q;i++){
			System.out.println(proc(ch,sc.nextInt(),sc.nextInt()));
		}
		sc.close();
	}

	private static int proc(char[] ch,int a,int b){
		int counter=0;
		for(int i=a;i<b&&i<ch.length;i++){
			if(ch[i-1]=='A'&&ch[i]=='C')counter++;
		}
		return counter;
	}
}
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	static{
		for(int i=0;i<30000;i++){
//			System.out.print("J");
		}
		for(int i=0;i<30000;i++){
//			System.out.print("O");
		}
		for(int i=0;i<30000;i++){
//			System.out.print("I");
		}
	}
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		char[] s=cin.next().toCharArray();
		int N=300000;
		/*
		s=new char[N*3];
		
		for(int i=0;i<N;i++){
			s[i]='J';
		}
		for(int i=0;i<N;i++){
			s[i+N*1]='O';
		}
		for(int i=0;i<N;i++){
			s[i+N*2]='I';
		}
		*/
		String J="J";
		String O="O";
		String I="I";
		int ans=0;
		for(int i=0;i<s.length;i++){
			while(i<s.length&&s[i]=='J'){
				int cntj=0;

				while(i<s.length&&s[i]=='J'){
					cntj++;
					i++;
				}
				int cnto=0;
				while(i<s.length&&s[i]=='O'){
					cnto++;
					i++;
				}
				if(cntj<cnto){
					continue;
				}
				int cnti=0;
				while(i<s.length&&s[i]=='I'){
					cnti++;
					i++;
				}
//				System.out.println(cntj+" "+cnto+" "+cnti);
				if(cnto<=cnti){
					ans=Math.max(ans, cnto);
				}
			}
		}
		System.out.println(ans);
	}

}
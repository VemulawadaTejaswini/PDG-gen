import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A=stdIn.nextInt();
		int B=stdIn.nextInt();
		int C=stdIn.nextInt();
		String s[]=new String[N];
		char ans[]=new char[N];
		for(int i=0;i<N;i++){
			s[i]=stdIn.next();
		}
		for(int i=0;i<N;i++){
			if(s[i].equals("AB")){
				if(A>B){
					A--;B++;ans[i]='B';
				}
				else
				if(B>A){
					B--;A++;ans[i]='A';
				}
				else
				if(A==B){
					if(A==1&&C==0&&i!=N-1&&s[i+1].equals("BC")){
						A--;B++;ans[i]='B';
					}
					else{
						B--;A++;ans[i]='A';
					}
				}
			}
			if(s[i].equals("AC")){
				if(A>C){
					A--;C++;ans[i]='C';
				}
				else
				if(C>A){
					C--;A++;ans[i]='A';
				}
				else
				if(A==C){
					if(A==1&&B==0&&i!=N-1&&s[i+1].equals("BC")){
						A--;C++;ans[i]='C';
					}
					else{
						C--;A++;ans[i]='A';
					}
				}
			}
			if(s[i].equals("BC")){
				if(C>B){
					C--;B++;ans[i]='B';
				}
				else
				if(B>C){
					B--;C++;ans[i]='C';
				}
				else
				if(C==B){
					if(C==1&&A==0&&i!=N-1&&s[i+1].equals("AB")){
						C--;B++;ans[i]='B';
					}
					else{
						B--;C++;ans[i]='C';
					}
				}
			}
			if(A<0||B<0||C<0){
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
		for(int i=0;i<N;i++){
			System.out.println(ans[i]);
		}
	}
}

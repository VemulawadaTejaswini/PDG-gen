import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		String S=stdIn.next();
		int A,B,C,D;
		A=Integer.valueOf(S.substring(0,1));
		B=Integer.valueOf(S.substring(1,2));
		C=Integer.valueOf(S.substring(2,3));
		D=Integer.valueOf(S.substring(3,4));
		int ans=A;
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				for(int k=0;k<2;k++){
					if(i==0)
						ans+=B;
					else
						ans-=B;
					if(j==0)
						ans+=C;
					else
						ans-=C;
					if(k==0)
						ans+=D;
					else
						ans-=D;
					if(ans==7){
						String a="-";
						String b="-";
						String c="-";
						if(i==0)
							a="+";
						if(j==0)
							b="+";
						if(k==0)
							c="+";
						System.out.println(A+a+B+b+C+c+D+"=7");
						System.exit(0);
					}
					ans=A;
				}
			}
		}
	}
}
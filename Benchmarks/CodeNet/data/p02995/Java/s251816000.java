import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		long A=stdIn.nextLong();
		long B=stdIn.nextLong();
		long C=stdIn.nextLong();
		long D=stdIn.nextLong();
		long ans=B-A+1,hoge=0,hoge2=0,hoge3=0;
		if(A>C)
			hoge=(A/C)*C;
		else
			hoge=0;
		if(A%C==0&&A>C)
			hoge-=C;
		if(B>C)
			hoge2=(B/C+1)*C;
		else
			hoge2=C;
		if(C==B)
			hoge2+=C;
		ans-=(hoge2-hoge)/C;ans++;
		//kireme
		if(A>D)
			hoge=(A/D)*D;
		else
			hoge=0;
		if(A%D==0&&A>D)
			hoge-=D;
		if(B>D)
			hoge2=(B/D+1)*D;
		else
			hoge2=D;
		if(D==B)
			hoge2+=D;
		ans-=(hoge2-hoge)/D;ans++;
		//kireme2
		hoge=C;hoge2=D;
		while(hoge%hoge2!=0){
			hoge3=hoge%hoge2;
			hoge=hoge2;
			hoge2=hoge3;
		}
		hoge3=(C*D)/hoge2;
		if(A>hoge3)
			hoge=(A/hoge3)*hoge3;
		else
			hoge=0;
		if(A%hoge3==0&&A>hoge3)
			hoge-=hoge3;
		if(B>C)
			hoge2=(B/hoge3+1)*hoge3;
		else
			hoge2=hoge3;
		if(hoge3==B)
			hoge2+=hoge3;
		ans+=(hoge2-hoge)/hoge3;ans--;
		System.out.println(ans);
	}
}
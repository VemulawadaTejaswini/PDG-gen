import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		long A=stdIn.nextLong();
		long B=stdIn.nextLong();
		long C=stdIn.nextLong();
		long D=stdIn.nextLong();
		long ans=B-A+1,hoge=0,hoge2=0,hoge3=0;
		boolean fin=false;
		if(A>C)
			hoge=(A/C)*C;
		else
			hoge=C;
		if(A<C)
			hoge=0;
		if(B>C){
			if(B%C!=0)
				hoge2=(B/C+1)*C;
			else
				hoge2=B;
		}
		else
			hoge2=C;
		if(hoge!=A&&hoge2!=B)
			fin=true;
		ans-=(hoge2-hoge)/C;
		if((hoge2-hoge)/C>0&&fin)
			ans++;
		fin=false;
		if(A>D)
			hoge=(A/D)*D;
		else
			hoge=D;
		if(A<D)
			hoge=0;
		if(B>D){
			if(B%D!=0)
				hoge2=(B/D+1)*D;
			else
				hoge2=B;
		}
		else
			hoge2=D;
		ans-=(hoge2-hoge)/D;
		if(hoge!=A&&hoge2!=B)
			fin=true;
		if((hoge2-hoge)/D>0&&fin)
			ans++;
		hoge=C;hoge2=D;
		fin=false;
		while(hoge%hoge2!=0){
			hoge3=hoge%hoge2;
			hoge=hoge2;
			hoge2=hoge3;
		}
		hoge3=(C*D)/hoge3;
		if(A>hoge3)
			hoge=(A/hoge3)*hoge3;
		else
			hoge=hoge3;
		if(A<hoge3)
			hoge=0;
		if(B>hoge3){
			if(B%hoge3!=0)
				hoge2=(B/hoge3+1)*hoge3;
			else
				hoge2=hoge3;
		}
		ans+=(hoge2-hoge)/hoge3;
		if(hoge!=A&&hoge2!=B)
			fin=true;
		if((hoge2-hoge)/hoge3>0&&fin)
			ans--;
		System.out.println(ans);
	}
}
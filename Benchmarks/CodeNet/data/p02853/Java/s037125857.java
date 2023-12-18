import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt(),y=sc.nextInt(),res=0;
		if(x==3)res=100000;
		if(x==2)res=200000;
		if(x==1)res=300000;
		if(y==3)res+=100000;
		if(y==2)res+=200000;
		if(y==1)res+=300000;
		if(res==600000)res+=400000;
		System.out.println(res);
	}
}
/*各競技において，
3
 位の選手は
100000
 円，
2
 位の選手は
200000
 円，
1
 位の選手は
300000
 円の賞金を獲得します．また，コード部門と装置実装部門の両方で
1
 位となった選手は，さらに
400000
 円の賞金を獲得します．*/
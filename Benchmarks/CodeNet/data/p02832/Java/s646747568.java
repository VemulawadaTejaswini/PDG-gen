import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	int a[]=new int[N];
	for(int i=0;i<N;i++) {
		a[i]=sc.nextInt();
}
	int ans=0;
	int breakNum=0;
	int now=1;
	for(int i=0;i<N;i++) {
		if(a[i]==now) {
			ans+=breakNum;
			breakNum=0;
			now++;
		}else {
			breakNum++;
		}
}
	ans+=breakNum;
	if(N==breakNum) {
		System.out.println(-1);
	}else {
		System.out.println(ans);
	}

}
}
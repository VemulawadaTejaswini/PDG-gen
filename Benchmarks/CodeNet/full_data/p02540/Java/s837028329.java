import java.util.Scanner;
public class Main {
	int as,kl,o,n,m;
	Scanner sc = new Scanner(System.in);
	public void solve() {
		n=sc.nextInt();
		int[] date=new int[n];
		int[] dat=new int[n];
for(o=0;o<n;o++) {
	date[o]=sc.nextInt();
	dat[o]=sc.nextInt();
}

for(o=0;o<n;o++) {
	as=1;
	for(m=0;m<n;m++) {
		if(date[o]>date[m]&&dat[o]>dat[m]) {
			as+=1;
		}else if(date[o]<date[m]&&dat[o]<dat[m]){
			as+=1;
		}
	}
	System.out.println(as);
}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}

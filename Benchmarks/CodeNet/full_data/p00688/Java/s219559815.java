import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt();
				if(a==0) break;
				int P=0, Q=0, R=0, S=0;
				for(int p=1; p<=a; p++) {
					if(a%p==0 && a/p<p) {
						int r=a/p;
						if(c==0) {
							int q=0;
							if(b%p==0) {
								P=p;
								S=b/q;
								Q=q;
								R=r;
								break;
							}
							int s=0;
							if(b%r==0) {
								P=p;
								S=s;
								Q=b/r;
								R=r;
								break;
							}
						}
						else {
							for(int q=-1*c; q<=c; q++) {
								if(q==0) continue;
								if(c%q==0) {
									int s=c/q;
									if(p*s+q*r==b) {
										P=p;
										S=s;
										Q=q;
										R=r;
										break;
									}
								}
							}
						}
					}
					if(p*p==a) {
						int r=p;
						if(c==0) {
							int q=0;
							if(b%p==0) {
								P=p;
								S=b/q;
								Q=q;
								R=r;
								break;
							}
							int s=0;
							if(b%r==0) {
								P=p;
								S=s;
								Q=b/r;
								R=r;
								break;
							}
						}
						else {
							for(int q=-1*c; q<=c; q++) {
								if(q==0) break;
								if(c%q==0 && c/q<=q) {
									int s=c/q;
									if(p*s+q*r==b) {
										P=p;
										S=s;
										Q=q;
										R=r;
										break;
									}
								}
							}
						}
					}
					if(P!=0) {
						break;
					}
				}
				if(P==0) System.out.println("Impossible");
				else System.out.println(P+" "+Q+" "+R+" "+S);


			}

		}
	}
}


import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().solve();

	}
	
	void solve(){
		int n,p;
		int oldp=0;
		int playn=0;
		int haven[];
		Scanner sc=new Scanner(System.in);
		while(true){
			n=sc.nextInt();
			p=sc.nextInt();
			playn=0;
			oldp=p;
			if(n+p==0)break;
			haven=new int[n];
			while(true){
				if(p>0){
					p--;
					haven[playn]++;
					if(haven[playn]==oldp){
						System.out.println(playn);
						break;
					}
				}else{
					p+=haven[playn];
					haven[playn]=0;
				}
				playn=(playn+1)%n;
			}
		}		
	}

}
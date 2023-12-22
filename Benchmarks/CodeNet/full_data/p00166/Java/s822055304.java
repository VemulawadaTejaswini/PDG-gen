import java.util.Scanner;


public class Main {

	Scanner sc;
	final double EPS=1e-7;
	
	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		sc=new Scanner(System.in);
		int n,m;
		while((m=ni())!=0){
			double s1=0;
			int theta;
			int remainder=360;
			for(int i=0;i<m-1;++i){
				theta=ni();
				s1+=Math.sin(Math.toRadians(theta));
				remainder-=theta;
			}
			s1+=Math.sin(Math.toRadians(remainder));
			
			n=ni();
			double s2=0;
			remainder=360;
			for(int i=0;i<n-1;++i){
				theta=ni();
				s2+=Math.sin(Math.toRadians(theta));
				remainder-=theta;
			}
			s2+=Math.sin(Math.toRadians(remainder));
			
			int ans;
			if(Math.abs(s1-s2)<EPS) ans=0;
			else if(s1>s2) ans=1;
			else ans=2;
			System.out.println(ans);
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}
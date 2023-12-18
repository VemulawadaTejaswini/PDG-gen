import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,m,n,x,y,z;
	int ans;
	String[] S;

	Main(){
		// 整数の入力
		n = sc.nextInt();
		d = sc.nextInt();
		double[][] X = new double[n][d];

		ans = 0;

		for(int i=0;i<n;i++){
			for(int j=0;j<d;j++){
				X[i][j]=sc.nextDouble();
			}
		}

		for(int i=0;i<n-1;i++){
			for(int i2=i+1;i2<n;i2++){
				double sum = 0;
				for(int j=0;j<d;j++){
					sum += Math.pow(X[i][j]-X[i2][j],2);
				}
				ans += intCheck(sum)?1:0;
			}
		}

		// 出力
		System.out.println(ans);
	}

	boolean intCheck(double d){
      		double dd = Math.sqrt(d);
		return (dd-(double)((int)dd))==0?true:false;
	}

	public static void main(String[] args){
		new Main();
	}
}
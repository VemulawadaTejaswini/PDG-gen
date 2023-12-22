
import java.util.Scanner;

public class Main {
	static int N,K,T,U,V,L;
	static int[] ninjin;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		K=sc.nextInt();
		T=sc.nextInt();
		U=sc.nextInt();
		V=sc.nextInt();
		L=sc.nextInt();
		ninjin=new int[N+1];
		for(int i=0;i<N;i++){
			ninjin[i]=sc.nextInt();
		}
		ninjin[N]=L;
		double now=0.0;
		double cTime=0.0;
		int hasC=0;
		boolean isc=false;
		int ccnt=0;
		double velo=U;
		double ans=0.0;
		while(now!=L){
			double ndist=ninjin[ccnt]-now;
			double ncarotto=cTime*V;
			double dist=0.0;
			// テ、ツコツコテ・ツ渉づ」ツδ妥」ツδッテ」ツδシテ・ツ按?」ツつ?
			if(ndist>ncarotto&&isc){
//				System.out.println(ans);
				dist=ncarotto;
				now += dist;
				ans += dist/velo;
				isc=false;
				cTime=0.0;
				velo=U;
			}
			
			// ninjinテ・ツ慊ーテァツつケ
			else{
//				System.out.println("ninjin"+ans);
				dist=ndist;
				now = ninjin[ccnt];
				ans += dist/velo;
				ccnt++;
				hasC++;
				if(isc){
					cTime -= dist/velo;
				}
			}
			if(!isc&&hasC>0||hasC>K){
				hasC--;
				velo=V;
				isc=true;
				cTime = T;
			}
		}
		System.out.printf("%.10f\n",ans);
	}
}
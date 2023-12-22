import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);


		while(true){
			int n=sc.nextInt();
			int m=sc.nextInt();

			if(n+m==0) break;

			int taro[]=new int[n];
			int hana[]=new int[m];
			int tsum=0,hsum=0;

			for(int i=0; i<n; i++){
				taro[i]=sc.nextInt();
				tsum+=taro[i];
			}
			for(int i=0; i<m; i++){
				hana[i]=sc.nextInt();
				hsum+=hana[i];
			}

			Arrays.sort(taro);
			Arrays.sort(hana);
			int k;
			boolean f=false;

			if((tsum-hsum)%2==0){
				if(tsum<hsum){

					k=(hsum-tsum)/2;

					for(int i=0; i<m; i++){
						if(f) break;
						for(int j=0; j<n; j++){
							if(f) break;
							
							if(hana[i]-taro[j]==k){
								f=true;
								System.out.println(taro[j]+" "+hana[i]);
							}
							else if(hana[i]<taro[j]) break;
						}
					}
				}
				else{//hsum<=tsum
					//if((tsum-hsum)%2!=0) break;
					k=(tsum-hsum)/2;

					for(int i=0; i<n; i++){
						if(f) break;
						for(int j=0; j<m; j++){
							if(f) break;
							
							if(taro[i]-hana[j]==k){
								f=true;
								System.out.println(taro[i]+" "+hana[j]);
							}
							else if(taro[i]<hana[j]) break;
						}
					}
				}//else
			}
			//System.out.println(f+" "+tsum+" "+hsum);
			if(!f) System.out.println("-1");
		}

	}

}
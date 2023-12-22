import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				double W=sc.nextDouble();
				double H=sc.nextDouble();
				int N=sc.nextInt();
				if(W+H+N==0) break;
				double[] x=new double[2*N];
				double[] y=new double[2*N];
				ArrayList<Double> list=new ArrayList<>();
				list.add(0.0);
				list.add(H);
				for(int i=0; i<2*N; i++) {
					x[i]=sc.nextDouble();
					y[i]=sc.nextDouble();
				}
				//ケーキの角といちごを結ぶ直線のy切片
				for(int i=0; i<2*N; i++) {
					double y1=(H-y[i])/(W-x[i])*(0-W)+H;
					double y2=(0-y[i])/(W-x[i])*(0-W);
					if(y1>=0 && y1<=H) {
						list.add(y1);
					}
					if(y2>=0 && y2<=H) {
						list.add(y2);
					}
				}
				//いちご二つを結ぶ直線のy切片
				for(int i=0; i<2*N-1; i++) {
					for(int j=i+1; j<2*N; j++) {
						double y3=(y[i]-y[j])/(x[i]-x[j])*(0-x[i])+y[i];
						if(y3>=0 && y3<=H) {
							list.add(y3);
						}
					}
				}
				Collections.sort(list);
				double[] list2=new double[2*N+2];
				double prev=0, cur=0, ans=0;
				int c=0;
				prev=list.get(c);
				
				while(c<list.size()-1) {
					c++;
					cur=list.get(c);
					if(cur-prev>0.000000001) {
					double mid=(prev+cur)/2.0;
					//midの時のいちごと結ぶ直線でy範囲探索
					for(int i=0; i<2*N; i++) {
						double y4=(y[i]-mid)/(x[i]+0.000000001)*W+mid;
						if(y4<0) y4=0;
						if(y4>H) y4=H;
						list2[i]=y4;
					}
					list2[2*N]=0;
					list2[2*N+1]=H;
					Arrays.sort(list2);
					int mid2=(2*N+2)/2;
					ans+=(cur-prev)*(list2[mid2]-list2[mid2-1]);
					}
					prev=cur;
				}
				ans /= H*H;
				System.out.println(ans);
				
				
			}

		}
	}
}

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String[] frsLine = sc.nextLine().split(" ");
		final int h = Integer.parseInt(frsLine[0]);
		final int w = Integer.parseInt(frsLine[1]);
		final int d = Integer.parseInt(frsLine[2]);
		final int[][] a = new int[h][w];
		for(int i=0;i<h;i++){
			String[] str = sc.nextLine().split(" ");
			for(int j=0;j<w;j++){
				a[i][j]=Integer.parseInt(str[j]);
			}
		}
		final int q=Integer.parseInt(sc.nextLine());
		for(int i=0;i<q;i++){
			int mp=0;
			String[] str=sc.nextLine().split(" ");
			int l = Integer.parseInt(str[0]);
			int r = Integer.parseInt(str[1]);
			int pxh=0,pxw=0;
			int cxh=0,cxw=0;		
			
			for(int j=0;j<h;j++){
				boolean f = false;
				for(int k=0;k<w;k++){
					if(a[j][k]==l){
						pxh=j;
						pxw=k;
						f=true;
						break;
					}
					if(f)break;
				}
			}	
			

			for(;l<r+1;){
			boolean f = false;				
				for(int j=0;j<h;j++){
					for(int k=0;k<w;k++){
						if(a[j][k]==l){
							cxh=j;
							cxw=k;
							f=true;
							break;
						}
					}
					if(f)break;
				}
				mp=mp+Math.abs(pxh-cxh)+Math.abs(pxw-cxw);
				pxh=cxh;
				pxw=cxw;
				l=l+d;
			}
				System.out.println(mp);
		}
	}
}
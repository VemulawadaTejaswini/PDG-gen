package G_33;

import java.util.Scanner;

public class Main {
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int in =scan.nextInt();
			String[] ans=new String[in];
			for(int k=0;k<in;k++){
				int[] ball=new int[10];
				int[] a=new int[10];
				int[] b=new int[10];
				int atop=0;
				int btop=0;
				for(int j=0;j<10;j++){
					ball[j]=scan.nextInt();
				}
				for (int i = 0; i < 10; i++) {
					if(ball[i]>atop){
						a[i]=ball[i];
						atop=a[i];
						//System.out.println("a"+a[i]);
					}else{
						b[i]=ball[i];
						//System.out.println("b"+b[i]);
					}
				}
				atop=0;
				btop=0;
				for(int i=0;i<10;i++){
					if(a[i]!=0){
						if(atop<a[i]){
							atop=a[i];
						}else{
							ans[k]="NO";
							break;
						}
					}else{
						if(btop<b[i]){
							btop=b[i];
						}else{
							ans[k]="NO";
							break;
						}
					}
					if(i==9)
						ans[k]="YES";
				}
			}
			for(int k=0;k<in;k++){
				if(ans[k]=="YES" || ans[k]=="NO")
					System.out.println(ans[k]);
			}
		}
	}
}
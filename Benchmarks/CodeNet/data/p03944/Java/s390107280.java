import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt();
		int n = scan.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] a = new int[n];


		for(int i=0;i<n;i++) {
			x[i]=scan.nextInt();
			y[i]=scan.nextInt();
			a[i]=scan.nextInt();
		}

		int maxX=0;
		int minX=w;
		int maxY=0;
		int minY=h;

		for(int i=0;i<n;i++) {

			if(a[i]==1) { //x<xiをぬる
				if(maxX<=x[i]) {
					maxX=x[i];
				}

			}else if(a[i]==2) {
				if(minX==w) {
					minX=x[i];
				}else if(minX!=0 && minX>x[i]) {
					minX=x[i];
				}

			}else if(a[i]==3) {
				if(maxY<=y[i]) {
					maxY=y[i];
				}

			}else if(a[i]==4) {
				if(minY==h) {
					minY=y[i];
				}else if(minY!=0 && minY>y[i]){
					minY = y[i];
				}
			}
		}
		int kuro =0;
		/*
		System.out.println(maxX);//maxXより小さいところを塗る
		System.out.println(minX);//minXより大きいところを塗る
		System.out.println(maxY);//maxYより小さいところを塗る
		System.out.println(minY);//minYより大きいところを塗る
		*/
		if(maxX>=minX && minX!=0) {
			kuro = w*h;
		}else if(maxY>=minY && minY!=0) {
			kuro = w*h;
		}else {
			if(maxX==0&&minX==w){
			kuro=w*maxY+w*(h-minY);
			}else if(maxY==0 && minY==h) {
				kuro=h*maxX + h*(w-minX);
			}else {
				kuro=h*(maxX)+h*(w-minX)+w*maxY+w*(h-minX);
				//System.out.println(kuro);
				//多すぎるので引く
				kuro=kuro-( (maxX*maxY)+(maxX*(h-minY))+((w-minX)*maxY)+((w-minX)*(h-minY)));
//System.out.println(kuro);
				if(minX==w) {

					kuro= maxX*h+maxY*w+w*(h-minY);
					kuro = kuro - ( (maxX*maxY)+(maxX*(h-minY))+((w-minX)*maxY)+((w-minX)*(h-minY)));


				}
				if(minY==h) {
					kuro= maxY*w+maxX*h+h*(w-minX);
					kuro = kuro - ( (maxX*maxY)+(maxX*(h-minY))+((w-minX)*maxY)+((w-minX)*(h-minY)));

				}
				}

		}
		//System.out.println(kuro);
		System.out.println(w*h-kuro);


		}


}

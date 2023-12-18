import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] X = new int[N];
		int[] Y = new int[N];
		int[] H = new int[N];
		for(int i=0,l=N; i<l; i++){
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
			H[i] = sc.nextInt();
		}
		for(int cH=1; true; cH++){
			for(int cX=0; cX<=100; cX++){
				for(int cY=0; cY<=100; cY++){
					boolean flag = true;
					for(int i=0,l=N; i<l; i++){
						if(!check(cH, cX, cY, H[i], X[i], Y[i])){
							flag = false;
							break;
						}
					}
					if(flag){
						System.out.println(cX+" "+cY+" "+cH);
						return;
					}
				}
			}
		}
	}
	public static boolean check(int cH, int cX, int cY, int H, int X, int Y){
		int ponH = Math.max(cH - Math.max(X-cX,cX-X) - Math.max(Y-cY,cY-Y), 0);
		if(ponH == H){
			return true;
		}else{
			return false;
		}
	}
}
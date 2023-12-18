import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		String[][] masu = new String[a][b];
		for(int i=0;i<a;i++){
			String mo = scan.next();
			for(int l=0;l<b;l++){
				masu[i][l]=String.valueOf(mo.charAt(l));
			}
		}
		int max =0;
		int kyo =0;
		int kyo1=0;
		int kyo2=0;
		for(int i=0;i<a;i++){
			for(int l=0;l<b;l++){
				if(masu[i][l].equals(".")){
					f:for(int j=i;j>=0;j--){
						for(int k=l;k>=0;k--){
							if(masu[j][k].equals("#")){
								kyo1=Math.abs(j-i)+Math.abs(k-l);
								break f;
							}
						}
					}
					s:for(int j=i;j<a;j++){
						for(int k=l;k<b;k++){
							if(masu[j][k].equals("#")){
								kyo2=Math.abs(j-i)+Math.abs(k-l);
								break s;
							}
						}
					}
					kyo=Math.min(kyo1,kyo2);
					if(max<kyo){max=kyo;}
				}
			}
		}

		System.out.println(max);
	}
}
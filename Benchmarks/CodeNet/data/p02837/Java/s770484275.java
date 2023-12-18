import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
    	
		int n=Integer.parseInt(scan.next());
		int a,x,y;
		int[][] xy=new int [15][15];//誰が　誰を　1or0
		for (int i=0;i<15;++i) {
			Arrays.fill(xy[i], -1);			
		}

		for (int i=0;i<n;++i) {
			a=Integer.parseInt(scan.next());
			for (int k=0;k<a;++k) {
				x=Integer.parseInt(scan.next());
				y=Integer.parseInt(scan.next());
				xy[a][x]=y;
			}
		}
		
		// solve
		int max=0;
		int[] d=new int[15];
		Arrays.fill(d, -1);
		for (int i=0;i<1<<n;++i) {//2のn情の組み合わせ
			for (int k=0 ;k<n;++k) {
				if ((i>>k&1)>0) {//k番目の人が正直もの		
					d[k]=1;
				}else {//k番目の人が不親切な人
					d[k]=0;
				}
			}
			
			//判定
			boolean bool =true;
			int count=0;//正直もののカウント
			for (int k=0 ;k<n;++k) {
					if (d[k]==1) {//ｋ番目の人が正直ものだったら
						++count;
						for (int j=0;j<n;++j) {//ｋ番目の人の証言を確認
							if (xy[k][j]==-1) continue;
							else if(xy[k][j]!=d[j]) bool=false;//証言が違う
						}

				}
			}if (bool) {
				max=Math.max(max, count);
				}
		}
        
       System.out.print(max);
        
        

}
}
//end
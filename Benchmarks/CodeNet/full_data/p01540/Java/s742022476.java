import java.util.*;
public class Main {
	//1700 cording start
	//1803 sample matched
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		//while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int [] xlist = new int[n];
			int [] ylist = new int[n];
			TreeSet<Integer> xl = new TreeSet<Integer>();
			TreeSet<Integer> yl = new TreeSet<Integer>();
			for(int i = 0 ; i < n; i++){
				xlist[i] = sc.nextInt();
				ylist[i] = sc.nextInt();
				xl.add(xlist[i]);
				yl.add(ylist[i]);
			}
			
			int [] xsorted = new int[xl.size()];
			int [] ysorted = new int[yl.size()];
			int ind = 0;
			for(int v: xl){
				xsorted[ind++] = v;
			}
			ind = 0;
			for(int v: yl){
				ysorted[ind++] = v;
			}
			
			int [][] acc = new int[yl.size() + 1][xl.size()+1];
			for(int k = 0 ; k < n; k++){
				int x = Arrays.binarySearch(xsorted, xlist[k]) + 1;
				int y = Arrays.binarySearch(ysorted, ylist[k]) + 1;
				for(int i = y; i < acc.length; i++){
					for(int j = x; j < acc[i].length; j++){
						acc[i][j]++;
					}
				}
			}
			
			//debug
//			System.out.println(Arrays.toString(ysorted));
//			System.out.println(Arrays.toString(xsorted));
//			System.out.println(yl.size() + " " + xl.size());
//			for(int i = 0 ; i < acc.length; i++){
//				System.out.print("i = " + i);
//				for(int j = 0; j < acc[i].length; j++){
//					System.out.print(acc[i][j] + " ");
//				}
//				System.out.println();
//			}
			
			//query
			for(int i = 0 ; i < m; i++){
				int minx = sc.nextInt();
				int miny = sc.nextInt();
				int maxx = sc.nextInt();
				int maxy = sc.nextInt();
				
				int x1,y1,x2,y2;
				x1 = bs(xsorted, minx);
				y1 = bs(ysorted, miny);
				x2 = bs(xsorted, maxx);
				if(Arrays.binarySearch(xsorted, maxx) >= 0) x2++;
				y2 = bs(ysorted, maxy);
				if(Arrays.binarySearch(ysorted, maxy) >= 0) y2++;
				
				//System.out.println("x1 = " + x1 + "y1 = " + y1 + "x2 = " + x2 +" y2 = " + y2);
				
				int res = acc[y2][x2] + acc[y1][x1] - acc[y2][x1] - acc[y1][x2];
				System.out.println(res);
			}
		//}
		
	}


	private int bs(int[] a, int x) {
		int mid, left = 0, right = a.length -1;
		while(left <= right){
			mid = (left + right) / 2;
			if(a[mid] == x){
				return mid;
			}
			if(a[mid] < x){
				left = mid + 1;
			}
			else{
				right = mid - 1;
			}
		}
		return left;
	}


	public static void main(String [] args){
		new Main().doit();
	}
}
import java.util.*;
import java.awt.geom.*;
public class Main {
	int [][] map;
	int ans;
	String [][] boards;
	boolean isused [];

	private void doit(){
		Scanner sc = new Scanner(System.in);
		int datasetcount = 1;
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			double [] xlist = new double[n * 2];
			double [] ylist = new double[n * 2];
			double [][] inputlist = new double[n][4];
			for(int i = 0; i < n; i++){
				double inputx = sc.nextDouble();
				double inputy = sc.nextDouble();
				double inputr = sc.nextDouble();
				//calc a vertex
				for(int j = 0; j < 2; j++){
					double x;
					if(j == 0){
						x = inputx - inputr;
					}
					else{
						x = inputx + inputr;
					}
					inputlist[i][j] = x;
					xlist[i * 2 + j] = x;
				}
				for(int j = 0; j < 2; j++){
					double y;
					if(j == 0){
						y = inputy - inputr;
					}
					else{
						y = inputy + inputr;
					}
					inputlist[i][j + 2] = y;
					ylist[i * 2 + j] = y;
				}
				
			}
			Arrays.sort(xlist);
			Arrays.sort(ylist);
			//debug
//			for(int i = 0; i < xlist.length; i++){
//				System.out.print(xlist[i] + " ");
//			}
//			System.out.println();
//			for(int i = 0; i < ylist.length; i++){
//				System.out.print(ylist[i] + " " );
//			}
//			System.out.println();
			
			//create a mesh
			boolean [][] mesh = new boolean[ylist.length -1][xlist.length -1];
			for(int i = 0; i < n; i++){
//				double firstXvalue = inputlist[i][0];
//				double firstYvalue = inputlist[i][1];
//				double lastXvalue = inputlist[i][2];
//				double lastYvalue = inputlist[i][3];
				int firstXind = Arrays.binarySearch(xlist, inputlist[i][0]);
				int lastXind  = Arrays.binarySearch(xlist, inputlist[i][1]);
				int firstYind = Arrays.binarySearch(ylist, inputlist[i][2]);
				int lastYind  = Arrays.binarySearch(ylist, inputlist[i][3]);
				//System.out.println("valuedebug= " + inputlist[i][0] + " " + inputlist[i][1] + " " + inputlist[i][2] + " " + inputlist[i][3]);
				//System.out.println("indexdebug= " + firstXind + " " + lastXind + " " + firstYind + " " + lastYind);
				for(int meshY = firstYind; meshY < lastYind; meshY++){
					for(int meshX = firstXind; meshX < lastXind; meshX++){
						mesh[meshY][meshX] = true;
					}
				}
			}
			
			//calc a area
			double res = 0.0;
			for(int i = 0; i < mesh.length; i++){
				for(int j = 0; j < mesh[i].length; j++){
					if(mesh[i][j]){
						double sideX = xlist[j + 1] - xlist[j];
						double sideY = ylist[i + 1] - ylist[i];
						double nowarea = sideX * sideY;
						res += nowarea;
					}
				}
			}
			//debug
//			System.out.println("meshdebug= ");
//			for(int i = 0; i < mesh.length; i++){
//				for(int j = 0; j < mesh.length; j++){
//					System.out.print(mesh[i][j] + " ");
//				}
//				System.out.println();
//			}
			System.out.printf("%d %.2f\n",datasetcount++, res);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}
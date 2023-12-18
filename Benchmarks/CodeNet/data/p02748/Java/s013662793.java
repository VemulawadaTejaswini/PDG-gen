import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rCnt = sc.nextInt();
		int dCnt = sc.nextInt();
		int minR = 10000;
		int minD = 10000;
		int m = sc.nextInt();
		int[] rList = new int[rCnt];
		int[] dList = new int[dCnt];
		for(int i=0;i<rCnt;i++) {
			rList[i] = sc.nextInt();
			if(rList[i]<minR){
				minR = rList[i];
			}
		}
		for(int i=0;i<dCnt;i++) {
			dList[i]=sc.nextInt();
			if(dList[i]<minD){
				minD = dList[i];
			}
		}
		int minC = minR+minD;
		int[][] cList = new int[m][3];
		for(int i=0;i<m;i++) {
			int cost = rList[sc.nextInt()-1]+dList[sc.nextInt()-1]-sc.nextInt();
			if(cost<minC){
				minC = cost;
			}			
		}
		
		System.out.println(minC);
		
	}
	

}

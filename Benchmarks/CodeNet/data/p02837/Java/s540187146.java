import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int N;
	static int[] A ;
	static int[][] x ;
	static int[][] y ;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = new int[N];
		x = new int[N][];
		y = new int[N][];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			x[i] = new int[A[i]];
			y[i] = new int[A[i]];
			for(int j=0;j<A[i];j++) {
				x[i][j]=sc.nextInt();
				y[i][j]=sc.nextInt();
			}
		} 
		ArrayList<Pair> useTestimonyList = new ArrayList<>();
		ArrayList<Integer> honestList=new ArrayList<>();
		System.out.println(count(useTestimonyList,honestList));
	}
	
	static int count(ArrayList<Pair> useList,ArrayList<Integer> honestList) {
		if(honestList.size()==N) {
			if(!check(useList,honestList)) {
				return 0;
			}else {
				int tmp = 0;
				for(int tmp1:honestList) {
					if(tmp1==1) {
						tmp++;
					}
				}
				return tmp;
			}
		}else {
			ArrayList<Pair> tmpUseList = (ArrayList<Pair>) useList.clone();
			ArrayList<Integer> tmpHonestList = (ArrayList<Integer>) honestList.clone();
			for(int i=0;i<A[honestList.size()];i++) {
				Pair pair = new Pair();
				pair.x = x[honestList.size()][i];
				pair.y = y[honestList.size()][i];
				tmpUseList.add(pair);
			}
			tmpHonestList.add(1);
			honestList.add(0);
			return Math.max(count(useList,honestList), count(tmpUseList,tmpHonestList));
		}
	}
	
	static boolean check(ArrayList<Pair> useList,ArrayList<Integer> honestList) {
		boolean flag =true;
		for(Pair pair:useList) {
			if(!(honestList.get(pair.x-1)==pair.y)) {
				flag = false;
			}
		}
		return flag;
	}
}
class Pair{
	int x;
	int y;
}
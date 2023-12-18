
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
 static int[][] road={{0,1},{1,0}};
 static int num=0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int[][] array = new int[3][num+1];
		for (int i = 1; i <=2; i++) {
			for (int j = 1; j <= num; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		int sum=0;
		List<Integer> list=new ArrayList();
		deepRoad(0,0,array,sum,list);
		
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
	}

	static void deepRoad(int x,int y,int [][]array,int sum,List<Integer> list) {
		sum+=array[x][y];
		if(x==2&&y==num){
			list.add(sum);
		}
		int m=0,n=0;
		for(int i=0;i<2;i++){
			m=x+road[i][0];
			n=y+road[i][1];
			if(m<=2&&n<=num){
				deepRoad(m,n,array,sum,list);
			}
		}
	}

}

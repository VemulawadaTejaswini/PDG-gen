import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int m = cin.nextInt();
		int[] p = new int[m];
		
		int[] count =  new int[n+1];	//记录每个辖区有多少个城市,从1开始计数辖区,直接和P[i]对应，从0开始记录城市的个数
		String[] index = new String[m];	//存储每个城市的顺序下标，如果有排序，这个index记录排序的下标
		String[][] arr = new String[n][m];
		
		for(int i=0; i<m; i++) {
			p[i] = cin.nextInt();
			int t = cin.nextInt();
			cin.nextLine();
			arr[p[i]-1][count[p[i]]] = String.valueOf(i) + "&" + String.valueOf(count[p[i]] + 1) + "&" + String.valueOf(t);
			index[i] = String.valueOf(count[p[i]]+1);
			count[p[i]]++;
		}
		
		//***********************************************
		for(int i=0; i<n; i++) {
			//一行是一个辖区的所有城市，要对这些城市的建造年份进行排队，使用冒泡
			for(int a=0; a<count[i+1]-1; a++) {	
				for(int b=0; b<count[i+1]-1-a; b++) {
					String[] ta = arr[i][b].split("&");
					String[] tb = arr[i][b+1].split("&");
					if(Integer.valueOf(ta[2]) > Integer.valueOf(tb[2])) {
						arr[i][b] = ta[0] + tb[1] + tb[2];
						arr[i][b+1] = tb[0] + ta[1] + ta[2];
						index[Integer.valueOf(ta[0])] = tb[1];
						index[Integer.valueOf(tb[0])] = ta[1];
					}
				}
			}
		}
		for(int i=0; i<m; i++) {
			System.out.println(String.format("%06d",p[i]) + String.format("%06d",Integer.valueOf(index[i])));
		}
	}
}

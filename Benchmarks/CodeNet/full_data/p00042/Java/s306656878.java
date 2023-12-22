import java.util.*;

public class Main{
	public static int[] search(int[][] data, int i, int sumV, int sumW, int maxV, int minW, int lim){
		if( i == data.length-1 ){
			int[] temp1 = new int[2];
			temp1[0] = sumV+data[i][0];
			temp1[1] = sumW+data[i][1];
			int[] temp2 = new int[2];
			temp2[0] = sumV;
			temp2[1] = sumW;
			if( temp1[1] < lim ){
				return temp1;
			} else {
				return temp2;
			}
		}
		int[] temp1 = search(data, i+1, sumV+data[i][0], sumW+data[i][1], maxV, minW, lim);;
		int[] temp2 = search(data, i+1, sumV, sumW, maxV, minW, lim);
		if( sumW+data[i][1] > lim ){
			return temp2;
		} else if( temp1[0] > temp2[0] ){
			return temp1;
		} else if( temp1[0] == temp2[0] && temp1[1] < temp2[1] ){
			return temp1;
		} else {
			return temp2;
		}
	}
		
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		int W;
		while( (W = stdIn.nextInt()) != 0 ){
			int n = stdIn.nextInt();
			String[][] s = new String[n][2];
			int[][] data = new int[n][2];
			for(int i = 0; i < n; i++){
				String str = stdIn.next();
				s[i] = str.split(",");
				data[i][0] = Integer.parseInt(s[i][0]);
				data[i][1] = Integer.parseInt(s[i][1]);
			}
			int[] temp = search(data, 0, 0, 0, 0, W, W);
			List<Integer> list = new ArrayList<Integer>();
			list.add(temp[0]); list.add(temp[1]);
			result.add(list);
		}
		int i = 1;
		for(List<Integer> list : result){
			System.out.println("Case " + i + ":");
			for(Integer in : list){
				System.out.println(in);
			}
			i++;
		}
	}
}
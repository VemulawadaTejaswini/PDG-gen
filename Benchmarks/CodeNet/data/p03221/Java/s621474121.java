import java.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class Main{
	static int N,M;
	static int[] List;
	static int[][] city;
	static int[] Answer;
	
	public static class City implements Comparable<City> {
	    private int Pi;
	    private int Yi;
	    private int Count;
	    private int Flag;

	    public City(int Pi, int Yi, int Count, int Flag) {
	        this.Pi = Pi;
	        this.Yi = Yi;
	        this.Count=Count;
	        this.Flag = Flag;
	    }
	    @Override
	    public int compareTo(City o) {
	        return this.Yi - o.Yi;        
	    }
	    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss = new Scanner(System.in);
		N = ss.nextInt();
		M = ss.nextInt();
		List = new int[N+1];
		city = new int[M][4];
		java.util.List<City> list =new ArrayList<>();
		for (int i = 0; i < M; i++) {
			city[i][0] = ss.nextInt();
			city[i][1] = ss.nextInt();	
			city[i][2] = 1;
			city[i][3] =i;
			list.add(new City(city[i][0], city[i][1], city[i][2], city[i][3]));
		}
		Collections.sort(list);
		
		for (int i = 0; i < M; i++) {
			City c = list.get(i);
			Object p = c.Pi;
			Object cnt = c.Count;
			int n = Integer.parseInt(p.toString());
			List[n]++;
			list.set(i, new City(c.Pi, c.Yi, List[n], c.Flag));
		}
		Collections.sort(list, new Comparator<City>() {
		    @Override
		    public int compare(City o1, City o2) {
		        return o1.Flag - o2.Flag;
		    }
		});
		for (int i = 0; i < M; i++) {
			City out = list.get(i);
			Object out_1 = out.Pi;
			Object out_2 = out.Count;
			int aa = Integer.parseInt(out_1.toString());
			String str = String.format("%06d", aa);
			System.out.print(str);
			int bb = Integer.parseInt(out_2.toString());
			String str1 = String.format("%06d", bb);
			System.out.print(str1);
			System.out.println();

		}
		
	}

}

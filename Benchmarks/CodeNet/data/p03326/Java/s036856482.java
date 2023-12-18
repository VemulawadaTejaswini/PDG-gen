import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		List<long[]> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			long[] line = {in.nextLong(),in.nextLong(),in.nextLong()};
			list.add(line);
		}
		long[] values = new long[8];
		values[0] = getSum(m,changeSign(1,1,1,list));
		values[1] = getSum(m,changeSign(1,1,-1,list));
		values[2] = getSum(m,changeSign(1,-1,1,list));
		values[3] = getSum(m,changeSign(1,-1,-1,list));
		values[4] = getSum(m,changeSign(-1,1,1,list));
		values[5] = getSum(m,changeSign(-1,1,-1,list));
		values[6] = getSum(m,changeSign(-1,-1,1,list));
		values[7] = getSum(m,changeSign(-1,-1,-1,list));
		long max = 0;
		for(long v : values) {
			if(v>max) {
				max = v;
			}
		}
		System.out.println(max);
	}
	
	public static List<long[]> changeSign(int xSign,int ySign,int zSign,List<long[]> list){
		List<long[]> newList = new ArrayList<>();
		for(long[] line : list) {
			long x = line[0];
			long y = line[1];
			long z = line[2];
			if(xSign<0) x = -x;
			if(ySign<0) y = -y;
			if(zSign<0) z = -z;
			long[] newLine = {x,y,z};
			newList.add(newLine);
		}
		return newList;
	}
	
	public static long getSum(int m, List<long[]> list) {
		long value = 0;
		List<Long> newList = list.stream().map(line -> line[0]+line[1]+line[2])
				.sorted((v1,v2) -> {
					if(v1>v2) return -1;
					else if(v1<v2) return 1;
					else return 0;
				})
				.limit(m)
				.collect(Collectors.toList());
		for(long v : newList) {
			value += v;
		}
		return value;
	}

}
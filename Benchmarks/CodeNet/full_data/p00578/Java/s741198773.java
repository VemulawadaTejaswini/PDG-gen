import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main {

	static List<Long> orthometric = new LinkedList<Long>();
	static Map<Long,List<Integer>> seaLevel = new TreeMap<Long,List<Integer>>();

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int len = sc.nextInt();
			long now = 0l;
			for (int i=0; i<len; i++) {
				long a = sc.nextLong();
				if (a != now) {
					orthometric.add(a);
					if (!seaLevel.containsKey(a)) {
						List<Integer> list = new LinkedList<Integer>();
						list.add(orthometric.size()-1);
						seaLevel.put(a, list);
					} else seaLevel.get(a).add(orthometric.size()-1);
					now = a;
				}
			}
			if (orthometric.size()>0) {
				int max = findLand();
				System.out.println(max);
			} else System.out.println("0");  //全部0だったら
		}
	}

	public static int findLand() {
		int max = 0;
		Long[] oArray = new Long[orthometric.size()];
		orthometric.toArray(oArray);
		int count = 1;
		for (List<Integer> l : seaLevel.values()) {
			for (int i : l) {
				if ((i!=0)&&(i!=oArray.length-1)) {
					if ((oArray[i-1]!=-1)&&(oArray[i+1]!=-1)) count++;
					else if ((oArray[i-1]==-1)&&(oArray[i+1]==-1)) count--;
				} else if ((i==0)&&(i!=oArray.length-1)) {
					if (oArray[i+1]==-1) count--;
				} else if ((i!=0)&&(i==oArray.length-1)) {
					if (oArray[i-1]==-1) count--; 
				}
				oArray[i] = -1l;
			}
			max = Math.max(max, count);
		}
		return max;
	}
}

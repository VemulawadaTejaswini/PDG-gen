import java.util.*;
import java.util.Map.Entry;


public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n= sc.nextInt();
			if(n==0) break;
			Map<Integer,ArrayList<Integer>> map = new TreeMap<Integer,ArrayList<Integer>>();
			int h,r;
			//ArrayList<Integer> temp = new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				h = sc.nextInt();
				r=sc.nextInt();
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(r);
				map.put(h, temp);
			}
			int m= sc.nextInt();
			for(int i=n;i<n+m;i++){
				h=sc.nextInt();
				r=sc.nextInt();
				if(map.containsKey(h)){
					ArrayList<Integer> a = map.get(h);
					a.add(r);
					map.put(h, a);
				}else{
					ArrayList<Integer> temp = new ArrayList<Integer>();
					temp.add(r);
					map.put(h,temp);
				}
			}
			int[] rArray = new int[n+m];
			Iterator<Entry<Integer, ArrayList<Integer>>> entries = map.entrySet().iterator();
			int i=0;
			while(entries.hasNext()) {
				@SuppressWarnings("rawtypes")
				Map.Entry entry = entries.next();
				//int keyName = (Integer) entry.getKey();
				@SuppressWarnings("unchecked")
				ArrayList<Integer> valName = (ArrayList<Integer>)entry.getValue();
				for(int value : valName){
					rArray[i] = value;
					i++;
				}
			}
			int[] dp = new int[rArray.length+1];
			int max;
			for(int j=1;j<dp.length;j++){
				max = 0;
				for(int k=1;k<=j;k++){
					if(rArray[j-1]>rArray[k-1]){
						if(dp[k]>max){
							max = dp[k];
						}
					}
				}
				dp[j] = max + 1;
			}
			max = -1;
			for(int j=0;j<dp.length;j++){
				if(max<dp[j]){
					max = dp[j];
				}
			}
			System.out.println(max);
		}
	}
}
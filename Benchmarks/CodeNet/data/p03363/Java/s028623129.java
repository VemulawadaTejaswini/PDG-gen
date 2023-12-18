import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static long choose(long total, long choose){
	    if(total < choose)
	        return 0;
	    if(choose == 0 || choose == total)
	        return 1;
	    return choose(total-1,choose-1)+choose(total-1,choose);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		long count = 0;
		int[] arr = new int[size];
		Map<Integer,Integer> map = new HashMap<Integer,Integer>(); 
		arr[0] = sc.nextInt();
		map.put(arr[0], 1);
		for(int i=1;i<size;i++){
			int tmp = sc.nextInt();
			arr[i] = arr[i-1] + tmp;
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}else{
				map.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			if(entry.getKey() == 0){
				count+= choose(entry.getValue()+1,2);
			}else{
				count+= choose(entry.getValue(),2);
			}
		}
		System.out.println(count);
	}

}

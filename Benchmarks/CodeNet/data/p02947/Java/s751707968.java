

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Map<String, Integer> map=new HashMap<String, Integer>();
		int n=in.nextInt();
		long sum=0;
		for(int i=0;i<n;i++){
			String data=in.next();
			char[] charArray = data.toCharArray();
			Arrays.sort(charArray);
			if(map.get(new String(charArray))!=null){
				sum+=map.get(new String(charArray));
				map.put(new String(charArray), map.get(new String(charArray))+1);
			}else{
				map.put(new String(charArray), 1);
			}
		}
		System.out.println(sum);
	}
}

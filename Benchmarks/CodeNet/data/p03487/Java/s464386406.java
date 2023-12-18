import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> array = new ArrayList<Long>();
		for(int i=0;i<n;i++){
			array.add(sc.nextLong());
		}
		Collections.sort(array);
		array.add(-500l);
		long ans = 0;
		for(int i=0;i<100000000;i = i){
			int co = 0;
			for(int j = i;j<100000000;j++){
				if(co == 0){
					co++;
					continue;
				}
				
					co++;
				
				if(array.get(j) == array.get(j-1)){
					continue;
				}else if(array.get(j) > array.get(j-1)){
					if((co-1) >= array.get(j-1)){
						ans = ans + ((co-1) - array.get(j-1));
					}else{
						ans = ans + co -1;
					}
					i = j;
					break;
				}else{
					if((co-1) >= array.get(j-1)){
						ans = ans + ((co-1) - array.get(j-1));
					}else{
						ans = ans + (co-1);
					}
					System.out.println(ans);
					System.exit(0);
				}
			}
		}
	}
}

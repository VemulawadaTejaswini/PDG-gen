import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> nums=new ArrayList<Integer>(N);
		for(int i=0;i<N;i++) {
			nums.add(Integer.parseInt(sc.next()));
		}
		int ans=0;
		while(true)
		{
			
			int max=Collections.max(nums);
			if(max==0) {
				break;
			}
			int index=nums.indexOf(max);
			while(true) {
				nums.set(index, max-1);
				if(index==N-1) {
					break;
				}else if(nums.get(index)==nums.get(index+1)-1) {
					index+=1;
				}else {
					break;
				}
			}
			ans++;
			
		}
		System.out.println(ans);
		sc.close();
	}
	
}

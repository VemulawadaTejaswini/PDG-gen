import java.util.*;
public class Main{
	public static void main(String[] args){
  		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer> start = new ArrayList<>();
		ArrayList<Integer> end = new ArrayList<>();
		int keep1;
		int keep2;
		int keep3;
		boolean result = false;
		for(int i=0;i<m;i++){
			keep1 = sc.nextInt();
			keep2 = sc.nextInt();
			if(keep1==1){
				start.add(keep2);
			}
			else if(keep2==n){
				end.add(keep1);
			}
		}
		int length = start.size();
		for(int i=0;i<length;i++){
			keep3 = start.get(i);
			result = end.contains(keep3);
			if(result){
				System.out.println("POSSIBLE");
				break;
			}
		}
		if(!result){
			System.out.println("IMPOSSIBLE");
		}
	}
}

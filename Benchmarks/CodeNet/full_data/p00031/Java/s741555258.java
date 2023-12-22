import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		
		int[] dou = new int[10];
		for(int i = 0 ; i < 10; i++){
			dou[i] =(int) Math.pow(2, i);
		}
		List<Integer> list = new ArrayList<Integer>();
		while(scan.hasNext()){
			int n = scan.nextInt();
			for(int i = 10 - 1; i >= 0; i--){
				if(n > dou[i]){
					n = n-dou[i];
					list.add(i);
				}
				if(n == dou[i]){
					n = n-dou[i];
					list.add(i);
					break;
				}
			}
			Collections.sort(list);
			for(int i = 0; i < list.size(); i++){
				int j = list.get(i);
				if(i == list.size() -1){
					System.out.printf("%d\n", dou[j]);
				} else{
					System.out.printf("%d ", dou[j]);
				}
			}
		}
	}
}
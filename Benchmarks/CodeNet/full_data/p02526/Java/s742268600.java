import java.util.Scanner;
import java.util.HashMap;

class Main {
	public static void main(String args[]){
		int n,q;
		Scanner scan = new Scanner(System.in);
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		int count = 0;
		
		n = scan.nextInt();
		for(int i=0;i<n;i++){
			hm.put(scan.nextInt(),0);
		}
		q = scan.nextInt();
		for(int i=0;i<q;i++){
			if(hm.containsKey(scan.nextInt())){
				count++;
			}
		}
		System.out.println(count);
	}
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		long sss =0;
		long ddd =0;
		long sum =0;
		while(scan.hasNextLine()){
			int b = scan.nextInt();
			list.add(b);
		}
		for(int i=0;i<list.size();i++){
			if(list.get(i) < sss){
				sss = list.get(i);
			}
		}
		System.out.println("");
	}
}
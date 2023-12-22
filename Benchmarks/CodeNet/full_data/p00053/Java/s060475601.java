import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		ArrayList<Integer> al = new ArrayList<>();
		boolean soj = true;
		al.add((int)2);
		for(int i = 3; i <= 104729; i += 2){
			for(int j = 2; j < i; j++){
				if(i % j == 0){
					soj = false;
					break;
				}
			}
			if(soj) al.add(i);
		}
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n > 10000 || n == 0) break;
			int sum = 0;

			for(int i = 0; i < n; i++){
				sum += al.get(i);
			}
			out.println(sum);
			out.flush();
		}
	}
}
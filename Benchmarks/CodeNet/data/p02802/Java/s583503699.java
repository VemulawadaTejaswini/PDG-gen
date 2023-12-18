import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<Pair2> atcoder = new ArrayList<Pair2>();

		for(int i=0; i<N; i++){
			Pair2 pair = new Pair2(false, 0);
			atcoder.add(pair);
		}
		int count=0;
		int error=0;
		for(int i=0; i<M; i++){
			int p = sc.nextInt();
			String ans = sc.next();
			if(atcoder.get(p-1).ac==false){
				if(ans.equals("AC")){
					atcoder.get(p-1).ac=true;
					count++;
					error += atcoder.get(p-1).wa;
				}else{
					atcoder.get(p-1).wa++;
				}
			}
		}
		System.out.println(count+" "+error);
    }
}

class Pair2 {
	public boolean ac;
	public int wa;

	Pair2(boolean ac, int wa){
		this.ac = ac;
		this.wa = wa;
	}
}
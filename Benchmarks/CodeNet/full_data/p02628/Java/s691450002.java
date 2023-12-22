import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		ArrayList<Integer> p = new ArrayList<Integer>();
		int sum=0;
      
		for(int i=0; i<N; i++){
			p.add(sc.nextInt());
        }
		p.sort(null);
		for(int i=0; i<K; i++){
			sum += p.get(i);
        }
		System.out.println(sum);
    }
}

import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayDeque<Integer> a = new ArrayDeque<Integer>();

		for(int i=0; i<N; i++){
			if((i+1)%2!=N%2){
				a.addLast(sc.nextInt());
			}else{
				a.addFirst(sc.nextInt());
			}
		}
		String ans = "";
		for(int i=0; i<N; i++){
			ans += a.removeFirst() + " ";
		}
		System.out.println(ans);
    }
}

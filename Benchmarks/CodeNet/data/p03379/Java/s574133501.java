import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> X = new ArrayList<Integer>();
		for(int h = 0; h < N; h++){
		    int youso = sc.nextInt();
		    X.add(youso);
		}

		for(int i = 0; i < N; i++){
		    X.remove(i);
		    int poscen = N / 2;
		    int center = X.get(poscen);
		    System.out.println(center);
		}
	}
}
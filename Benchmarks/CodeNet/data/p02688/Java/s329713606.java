import java.util.*;
public class Main {
	public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int d = sc.nextInt();
        int a;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0 ; i < K; i++) {
        	for(int j = 0; j < d; j++) {
        		int num = 0;
        		a = sc.nextInt();
        		if(map.get(j) != null) {
        			num = map.get(j);
        		}
        		num++;
        		map.put(j, num);
        	}

        }

        for(int k = 0; k < N; k++) {
        	if(map.get(k) == null) {
        		System.out.println(k);
        	}
        }
    }
}
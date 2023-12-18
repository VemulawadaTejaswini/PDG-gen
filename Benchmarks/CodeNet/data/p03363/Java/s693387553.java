import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<Integer> inputList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
        	inputList.add(sc.nextInt());
        }

        int ans = 0;
        for (int i=0; i<n; i++) {
        	for(int l=i; l<n; l++) {
        		if (i==l) {
        			if (inputList.get(i) == 0) {
        				ans++;
        			}

        		} else {
        			int sum = 0;
        			for (int p=i; p<=l; p++) {
        				sum += inputList.get(p);
        			}
        			if (sum == 0) {
        				ans++;
        			}
        		}
        	}
        }

        System.out.println(ans);
	}
}
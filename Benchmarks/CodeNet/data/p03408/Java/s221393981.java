import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> mapplus = new HashMap<String, Integer>();
		HashMap<String, Integer> mapminus = new HashMap<String, Integer>();
		int N = sc.nextInt();
		String[] s1 = new String[N];
		for(int i = 0;i < N;i++) {
			s1[i] = sc.next();
		}
		int M = sc.nextInt();
		String[] s2 = new String[M];
		for(int i = 0;i < M;i++) {
			s2[i] = sc.next();
		}
		sc.close();
		int plus;
		for(int i = 0;i < N ;i++) {
			plus = 0;
			plus++;
			for(int k = i + 1;k < N;k++) {
				if(s1[i].equals(s1[k])) plus++;
			}
			if(mapplus.containsKey(s1[i])) {
				if(mapplus.get(s1[i]) < plus) mapplus.put(s1[i],plus);
			}
			else mapplus.put(s1[i],plus);
		}
		int minus;
		for(int i = 0;i < M ;i++) {
			minus = 0;
			minus--;
			for(int k = i + 1;k < M;k++) {
				if(s2[i].equals(s2[k])) minus--;
			}
			if(mapminus.containsKey(s2[i])) {
				if(mapplus.get(s2[i]) < minus) mapminus.put(s2[i],minus);
			}
			else mapminus.put(s2[i],minus);
		}
		int ans = 0;
		for(int i = 0;i < N ;i++) {
			int sum = 0;
			for(int k = 0;k < M;k++) {
				sum = mapplus.get(s1[i]);
				if(s1[i].equals(s2[k])) {
					sum = sum + mapminus.get(s2[k]);	
					break;
				}	
			}
			if(ans < sum) ans = sum;
		}
		System.out.println(ans);
	}

}
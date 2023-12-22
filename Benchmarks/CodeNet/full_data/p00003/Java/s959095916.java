import java.util.*;
 
class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	ArrayList<String> ynJudge = new ArrayList<>();
    	
    	int N = sc.nextInt();
    	int sideA, sideB, sideC;
    	int cnt = 0;
    	for(int i = 0; i < N; i++) {
    		sideA = sc.nextInt();
    		sideB = sc.nextInt();
    		sideC = sc.nextInt();
    		if(sideA * sideA == sideB * sideB + sideC * sideC ||
    		   sideB * sideB == sideA * sideA + sideC * sideC ||
    		   sideC * sideC == sideA * sideA + sideB * sideB) {
    			ynJudge.add("YES");
    			cnt++;
    		} else {
    			ynJudge.add("NO");
    			cnt++;
    		}
    	}
    	for(int i = 0; i < cnt; i++) {
    		System.out.println(ynJudge.get(i));
    	}
    }
}
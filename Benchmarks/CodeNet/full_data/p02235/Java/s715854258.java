import java.util.*;

public class Main {
	
	HashMap<String,Integer> cache = new HashMap<>();
	
	public int longest(String a, String b) {
		String cacheKey = a+","+b;
		if(cache.containsKey(cacheKey)) {
			return cache.get(cacheKey);
		}
		
		int answer = 0;
		if(a.isEmpty() || b.isEmpty()) {
			cache.put(cacheKey,answer);
			return 0;
		}
		
		if(a.charAt(0) == b.charAt(0)) {
			answer +=1+longest(a.substring(1),b.substring(1));
		}else {
		answer += Math.max(longest(a.substring(1),b),longest(a,b.substring(1)));
		}
		cache.put(cacheKey,answer);
		
		return answer;
	}
	
	public int longestFast(String a, String b) {
		int x= a.length();
		int y= b.length();
		
		int[][] matrix = new int[x+1][y+1];
		for(int i = 0; i<=x; i++) {
			for(int k =0; k<=y; k++) {
				matrix[i][k]=0;
			}
		}
		
		for(int i = 1; i<=x; i++) {
			for(int k =1; k<=y; k++) {
				if(a.charAt(i-1)==b.charAt(k-1)) {
					matrix[i][k]=matrix[i-1][k-1]+1;
				}else {
					matrix[i][k]=Math.max(matrix[i][k-1],matrix[i-1][k]);
				}
			}
		}
		
		return matrix[x][y];
		
		
	}

	public static void main(String[] args) {
		Main test = new Main();
		Scanner sc = new Scanner(System.in);
		int checks = sc.nextInt();
		for(int i =0;i<checks;i++) {
			System.out.println(test.longestFast(sc.next(),sc.next()));
		}
		
		
	}
}

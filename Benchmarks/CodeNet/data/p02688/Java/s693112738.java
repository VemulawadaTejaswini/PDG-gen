import java.util.*;
public class Main {// Main
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		HashSet<Integer> map =new HashSet<Integer>();
		for(int i =  1 ; i<=k; i++) {
			int d = sc.nextInt();
			for(int  j = 1 ; j<=d ;j++) {
				int x = sc.nextInt();
				map.add(x);
			}
		}
		System.out.println(n - map.size());
    }
}

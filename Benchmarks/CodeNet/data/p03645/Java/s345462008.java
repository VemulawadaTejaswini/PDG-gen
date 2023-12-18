import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        ArrayList<Integer> mid = new ArrayList<>(); 
        for(int i = 0; i < m; i++){
        	a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            if(a[i] == 1){
            	mid.add(b[i]);
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < mid.size(); j++){
            	if(a[i] == mid.get(j) && b[i] == n){
            		System.out.println("POSSIBLE");
                    return;
            	}
            }
        }
        System.out.println("IMPOSSIBLE");
	}
}
import java.util.*;
 
public class Main {

	public static void main(String[] args) {
    	System.out.println(metodo());   
    }
 
    public static int metodo() {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	List<Integer>[] numbers = new ArrayList[n];
    	int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
        	numbers[i] = new ArrayList<>();
        }
        for (int  i= 0; i < m; i++) {
            int s = sc.nextInt() - 1;
            int t = sc.nextInt() - 1;
            numbers[s].add(t);
        }
        Arrays.fill(array1, -1);
        int n1 = 0;
        for (int i = 0; i < n; i++) {
            n1 = Math.max(n1, metodo2(i,array1, numbers));
        }
        return n1;
    }
 
    public static int metodo2(int v, int[] array1, List<Integer>[] numbers) {
        if (array1[v] != -1) return array1[v];
 
        int n1 = 0;
 
        for (int u: numbers[v]) {
            if (array1[u] == -1) {
            	metodo2(u,array1,numbers);
            }
            n1 = Math.max(n1, array1[u] + 1);
        }
 
        return array1[v] = n1;
    }
}

import java.util.*; 

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        
        int[][] data = new int[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = sc.nextInt();
            data[i][1] = sc.nextInt();
        }
        
        double tmp = 0;
        int kaijou = 0;
        
        // 順列全探索
        do {
            for (int i = 0; i < n-1; i++) {
                int p = array[i];
                int q = array[i+1];
                
                int x1 = data[p][0];
                int x2 = data[q][0];
                int y1 = data[p][1];
                int y2 = data[q][1];
                
                tmp += Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
            }
            kaijou++;
        } while (nextPermutation(array));
        
        
        tmp = tmp / kaijou;
        System.out.println(tmp);
        
    }
    
    public static boolean nextPermutation(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i - 1] < array[i]) {
                int j = find(array, array[i - 1], i, array.length - 1);
                int temp = array[j];
                array[j] = array[i - 1];
                array[i - 1] = temp;
                Arrays.sort(array, i, array.length);
                return true;
            }
        }
        return false;
    }
	 
    private static int find(int[] array, int dest, int f, int l) {
        if (f == l) return f;
        
        int m = (f + l + 1) / 2;
        return (array[m] <= dest) ? find(array, dest, f, m - 1) : find(array, dest, m, l);
    }
}
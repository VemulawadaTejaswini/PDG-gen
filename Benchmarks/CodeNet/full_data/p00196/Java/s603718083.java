import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
        	int n = sc.nextInt();
        	if(n==0) break;
        	
            String[] s = new String[n];
            int[][] a = new int[n][3];
            for (int i=0;i<n;i++) {
                s[i] = sc.next();
                for (int j=1;j<n;j++) a[i][sc.nextInt()]++;
                a[i][2] = i;
            }
            Arrays.sort(a, new Comparator<int[]>(){
                public int compare(int[] o1, int[] o2) {
                    if (o1[0] == o2[0]) {
                        if (o1[1]==o2[1]){
                        	return o1[2] - o2[2];
                        }else{
                        	return o1[1] - o2[1];
                        }
                    }
                    return o2[0] - o1[0];
                }
            });
            for(int i=0;i<n;i++) System.out.println(s[a[i][2]]);
        }
    }
}
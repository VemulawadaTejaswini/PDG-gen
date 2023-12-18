import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] ken = new int[n+1][2];

        for(int i = 0;i < m;i++) {
            ken[i][0] = sc.nextInt();
            ken[i][1] = sc.nextInt();
        }
        for (int j = 0;j < ken.length;j++) {
            System.out.println(String.format("%06d", ken[j][0]) + String.format("%06d", cntNum(ken[j][0],ken[j][1],ken)));
        }
        sc.close();
    }

    private static int cntNum(int a,int c,int[][] b) {

    	ArrayList<Integer> al = new ArrayList<Integer>();
    	for(int i = 0;i < b.length;i++) {
    		if(b[i][0] == a) {
    			al.add(b[i][1]);
    		}
    	}
		Collections.sort(al);

		for(int j = 0;j < al.size();j++) {
			if(al.get(j) == c) {
				return j+1;
			}
		}

        return -1;
    }
}
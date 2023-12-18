// http://abc032.contest.atcoder.jp/tasks/abc032_d

import java.util.*;
 
public class Main {
    
	public static void main(String[] args) {
 
	Scanner sc  = new Scanner(System.in);
        


    int N  = Integer.parseInt(sc.next());
    int W  = Integer.parseInt(sc.next());
    String[][] map = new String[N+1][W+1];

    for(int i=0;i<N;i++){
        
        String s = sc.next();
        char[] c1 = s.toCharArray();
        
        for(int k=0;k<W;k++){
            
        map[i][k] =  String.valueOf(c1[k]);
        
        }
    }
    
      for(int i=0;i<N;i++){
        for(int k=0;k<W;k++){
            
            System.out.print(map[i][k]);

        }
        System.out.println();
        
         for(int j=0;j<W;j++){
            
            System.out.print(map[i][j]);

        }
        System.out.println();
    }


    //    System.out.print(ans);
        System.out.println();
	}
	  static 	public void mapDebug(String[][] a) {
		System.out.println("--------map display---------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------" + '\n');
	}
        
}
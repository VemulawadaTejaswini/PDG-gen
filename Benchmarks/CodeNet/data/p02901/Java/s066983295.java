import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
import java.util.ArrayList;

  
public class Main {
	static class Key {
        public int cost;
        public int state;
      }
  
  	void run() {
     
    }

    public static void main(String[] args) {
     // new Main().run();
       
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      int[] results = new int[1 << n];
      Arrays.fill(results, 0x35f5e100);
      
      ArrayList<Key> keys = new ArrayList<Key>(m);
      //Key[] keys = new Key[m];
      for (int i = 0; i < m; i++) {
        Key k = new Key();
        k.cost= scanner.nextInt();
        int num = scanner.nextInt();
        int sum = 0;
        while (num > 0) {
          	sum |= 1 << (scanner.nextInt() - 1);
        	num--;
        }
        k.state = sum;
        results[sum] = k.cost;
        keys.add(k);
      }
      
      results[0] = 0;
	  for (int i = 0; i < results.length; i++) {
        for (int j = 0; j < m; j++) {
          results[i | keys.get(j).state] = 
            Math.min(results[i | keys.get(j).state], results[i] + keys.get(j).cost);
        }
        //System.out.println(results[i]);
      }
      
      if (results[results.length - 1] == 0x35f5e100)
        System.out.println("-1");
      else
        System.out.println(results[results.length - 1]);
    }
  
}

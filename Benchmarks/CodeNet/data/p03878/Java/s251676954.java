

import java.util.Arrays;
import java.util.Scanner;

class event implements Comparable<event>{
		public int a;
		public int b;
		public event(int a , int b){
			this.a = a;
			this.b = b;
		}
		
		public int compareTo(event other){
			// return b - other.b;
			return Integer.compare(b , other.b);
		}
		
}

public class Main{


	
	public static void main(String[] args) {
			
		       Scanner in = new Scanner(System.in);
                       int N = in.nextInt();
                       int[] size = new int[2];
                       event[] vs = new event[2*N];
                       for (int x=0; x<2; x++)
                            for (int i=0; i<N; i++)
                                         vs[i+x*N] = new event(x, in.nextInt());

                      Arrays.sort(vs);

                  long mod = 1_000_000_007;
                  long res = 1L;
                  for (event e : vs)
                  {
                     if (size[1 - e.a] > 0){
                       res *= size[1 - e.a];
                       res %= mod;

                       size[1 - e.a]--;
                  }
                   else
                   {
                        size[p.t]++;
                    }
               }
			
			System.out.println(res);

	}

}
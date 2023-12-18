import java.util.*;
import java.io.*;
import static java.lang.Math.*;
import java.util.*;
public class Main {
	static class Pair{
    	public final int x,y;
    	Pair(int x,int y){this.x=x;this.y=y;}
    }
    public static void main(String[] $) {
        int n = sc.nextInt();
        int[] x=new int[n];
        int[] y=new int[n];
        for (int i = 0; i < n; i++) {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        List<Pair> list=new ArrayList<>();
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++){
            	if(i==j)continue;
              	list.add(new Pair(x[i]-x[j],y[i]-y[j]));
            }
        }
        int ans = n;
      	for(Pair pair:list){
          		int p=pair.x;
          		int q=pair.y;
                int t = 0;
                if (p == 0 && q == 0) continue;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if(i==j)continue;
                        if (x[i] - x[j] == p && y[i] - y[j]== q) t++;
                    }
                }
                if(ans>n-t)ans=n-t;
          
        }
        out.println(ans);
        out.close();
    }

    static PrintWriter out = new PrintWriter(System.out);

    static class sc {
        static Scanner s = new Scanner(System.in);

        static String next() {
            return s.next();
        }

        static String nextLine() {
            return s.nextLine();
        }

        static int nextInt() {
            return Integer.parseInt(s.next());
        }

        static long nextLong() {
            return Long.parseLong(s.next());
        }

        static double nextDouble() {
            return Double.parseDouble(s.next());
        }

        static boolean hasNext() {
            return s.hasNext();
        }

        static boolean hasNextInt() {
            return s.hasNextInt();
        }

    }

}

import java.util.*; 
import java.lang.*; 


public class Main{
    
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                long[] x = new long[N];
                long[] y = new long[N];
                
                double[] dis = new double[N];
                for(int i=0; i<N; i++){
                    x[i] = scan.nextLong();
                    y[i] = scan.nextLong();
                    
                    dis[i] = Math.sqrt((x[i])^2+(y[i])^2);
                }
                
                int max = 0;
                int min = 0;
                for(int i=0; i<N; i++){
                    if(dis[max]<dis[i]){
                        max = i;
                    }
                    if(dis[min]>dis[i]){
                        min = i;
                    }
                }
                
                long p = GetManhattan(x[max], y[max], x[min], y[min]);
                
                System.out.println(p);

        }
        
        static long GetManhattan (long x1, long y1, long x2, long y2) {
            long d = Math.abs(x1-x2)+Math.abs(y1-y2);
            return d;
        }
}
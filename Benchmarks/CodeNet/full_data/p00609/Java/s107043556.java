import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
        public static void main(String[] arg) throws IOException {
                Scanner sc = new Scanner(System.in);

                int AN, BN, R;
                int x,y;
                TreeMap<Integer, ArrayList<Integer>> tm; 
                ArrayList<Integer> ts; 

                while(true){
                        AN = sc.nextInt();
                        BN = sc.nextInt();
                        if(AN == 0 && BN == 0){ break; }
                        R = 4*sc.nextInt();
                        int[][] A = new int[AN][2];
                        for(int i = 0;i < AN; ++i){
                                A[i][0] = sc.nextInt();
                                A[i][1] = sc.nextInt();
                        }   
                        tm = new TreeMap<Integer, ArrayList<Integer>>();
                        for(int i = 0;i < BN; ++i){
                                x = sc.nextInt();
                                if((ts = tm.get(x)) == null){
                                        ts = new ArrayList<Integer>();
                                        tm.put(x , ts);
                                }   
                                ts.add(sc.nextInt());
                        }   
                        int e = 0;
                        boolean[][] I = new boolean[R+1][R+1];
                        for(int i = 0;i < R+1; ++i){
                                for(int j = 0;j < R+1; ++j){
                                        I[i][j] = (i*i+j*j <= R*R);
                                }   
                        }   
                        for(int i = 0;i < 10000; ++i){
                                if((ts = tm.get(i)) != null){
                                        Collections.sort(ts);
                                }   
                        }   
                        for(int i = 0;i < AN; ++i){
                                x = A[i][0];
                                y = A[i][1];
                                for(int j = Math.max(x-R,0); j < Math.min(10000,x+R+1); ++j){
                                        if((ts = tm.get(j)) != null){
                                                Iterator<Integer> it = ts.iterator();
                                                while(it.hasNext()){
                                                        int t = it.next();
                                                        if(t < y-R){
                                                                continue;
                                                        }
                                                        if(y+R < t){
                                                                break;
                                                        }
                                                        if(I[Math.abs(x-j)][Math.abs(y-t)]){
                                                                ++e;
                                                        }
                                                }
                                        }
                                }
                        }
                        System.out.println(e);
                }
        }
}
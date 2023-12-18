import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();   
        
        // 入力を受け取る
        int A, B, C, D, E, F;
        {int[] a = r.ii(); A = a[0]; B = a[1]; C = a[2]; D = a[3]; E = a[4]; F = a[5];}
        
        // 考えられる水の質量のパターンを列挙し、waterに保存する
        ArrayList<Integer> water = new ArrayList<>(930);
        for(int i = 1, k = 0, temp; i <= 30; i++)
            for(int j = 0; j <= 30; j++)
                if((temp=100*(A*i+B*j)) <= F)
                    water.add(temp);
                else
                    break;    
        water.sort(null);
                    
        double maxC = 0; // 最大の濃度
        int maxW = 100*A; // そのときの水の質量
        int maxS = 0; // そのときの砂糖の質量

        for(int w : water){ // waterを全探索
            int size = F+1-w; // sugar.length; ビーカーに入れられる砂糖の最大質量+1
            if(size <= 0) // waterは昇順なので、砂糖を入れられなくなった段階で終了
                break;
                
            // 水の質量wに対して砂糖は0~size[g]までいれられる
            // sugar[i]は入れてもいい砂糖の質量の、i[g]以下での最大値
            int[] sugar = new int[size]; 
            
            // 0~C-1[g]においてsugar[i] = 0
            // C~Dにおいてsugar[i] = C
            for(int i = C; i < Math.min(size, D); i++){
                sugar[i] = C;
                if(i == C && maxC < (double)C/w && C*100 <= w*E){
                    maxC = (double)C/w;
                    maxW = w;
                    maxS = C;
                }
            } 
            
            // D[g]以降についてdp
            for(int i = D; i < size; i++){
                int s = sugar[i] = max(sugar[i-C]+C, sugar[i-D]+D, sugar[i-1]);
                double c = (double)s/w;
                
                if(s*100 > w*E) // 過飽和になったら次の水へ
                    break;
                    
                if(maxC < c){ // 最大濃度の更新
                    maxC = c;
                    maxW = w;
                    maxS = s;
                }                    
            }
        }
        println(maxW+maxS+" "+maxS);
    }

    static void print(Object o){
        System.out.print(o.toString());
    }

    static void println(Object o){
        System.out.println(o.toString());
    }

    static int Int(String s){
        return Integer.parseInt(s);
    }

    static long Long(String s){
        return Long.parseLong(s);
    }

    static int max(int... ii){
        int max = ii[0];
        for(int i : ii) if(max < i) max = i;
        return max;
    }
    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }

        String s() throws IOException{
            return readLine();
        }

        String[] ss() throws IOException{
            return s().split(" ");
        }

        int i() throws IOException{
            return Int(s());
        }

        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Int(ss[j]);
            return ii;
        }

        long l() throws IOException{
            return Long(s());
        }

        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long(ss[j]);            
            return ll;
        }
    }
}
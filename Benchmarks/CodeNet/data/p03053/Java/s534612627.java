import java.io.*;
import java.util.*;
public class Main{
    static char[][] A;
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();        
        int[] HW = r.ii();
        int H = HW[0],
            W = HW[1];
        A = new char[H][W];
        HashSet<int[]> queue = new HashSet<>();
        for(int i = 0; i < H; i++){
            String Ai = r.s();
            for(int j = 0; j < W; j++){
                A[i][j] = Ai.charAt(j);
                if(A[i][j] == '#') queue.add(new int[]{i, j});
            }
        }
        int count = 0;
        while(true){
            Iterator<int[]> iterator = queue.iterator();
            HashSet<int[]> queue2 = new HashSet<>();
            while(iterator.hasNext()){
                int[] ij = iterator.next();
                int i = ij[0],
                    j = ij[1];
                turnBlack(i-1, j, queue2);
                turnBlack(i, j-1, queue2);
                turnBlack(i+1, j, queue2);
                turnBlack(i, j+1, queue2);
            }
            if(queue2.size() > 0){
                queue.clear();
                queue.addAll(queue2);
                count++;
            } else{
                break;
            }            
        }
        print(count);
    }
    static void turnBlack(int i, int j, HashSet<int[]> queue){
        try{
            if(A[i][j] == '.'){
                A[i][j] = '#';
                queue.add(new int[]{i, j});
            }
        } catch(ArrayIndexOutOfBoundsException e){}
    }
    static void print(Object o){
        System.out.println(o.toString());
    }
    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }
        String s() throws IOException{
            return readLine();
        }
        String[] ss() throws IOException{
            return readLine().split(" ");
        }
        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[]) throws Exception {
        String[] tokens = br.readLine().split(" ");
        boolean[] present = new boolean[6];
        for(int i=0;i<tokens.length;i++){
            int num = Integer.parseInt(tokens[i]);
            present[num] = true;
        }
        int ans = -1;
        for(int i=1;i<=5;i++){
            if(!present[i]){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }




    private static class Pair{
        int first,second;

        public Pair(int first,int second){
            this.first = first;
            this.second = second;
        }

        public int hashCode(){
            return Objects.hash(first,second);
        }

        public boolean equals(Object obj){
            if(obj!=null || !(obj instanceof  Pair))
                return false;
            Pair pair = (Pair)obj;
            return pair.first == first && pair.second == second;
        }
    }




}
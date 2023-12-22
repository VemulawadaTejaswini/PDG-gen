import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String args[]) throws Exception {
        String[] tokens = br.readLine().split(" ");
        int x = Integer.parseInt(tokens[0]);
        int y = Integer.parseInt(tokens[1]);
        boolean flag = true;
        if(!(y-2*x>=0 && (y-2*x)%2==0))
            flag = false;
        if(!(4*x-y>=0 && (4*x-y)%2==0))
            flag = false;
        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");
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
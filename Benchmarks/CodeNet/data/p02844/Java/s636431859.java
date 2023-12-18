import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        int N = in.i();
        char[] S = in.s().toCharArray();

        HashSet<Integer>[] one = new HashSet[N];
        one[N-1] = new HashSet<>();
        one[N-1].add(S[N-1]-'0');
        for(int i = N-2; i > -1; i--){
            one[i] = new HashSet<>(one[i+1]);
            one[i].add(S[i]-'0');
            if(one[i].size() == 10){
                for(int j = i-1; j > -1; j--){
                    one[j] = one[i];
                }
                break;
            }
        }

        HashSet<Integer>[] two = new HashSet[N];
        two[N-1] = new HashSet<>();
        for(int i = N-2; i > -1; i--){
            two[i] = new HashSet<>(two[i+1]);
            int ii = 10*(S[i]-'0');
            for(Integer j : one[i+1]){
                two[i].add(ii+j);
            }
            if(two[i].size() == 100){
                for(int j = i-1; j > -1; j--){
                    two[j] = two[i];
                }
                break;
            }
        }

        HashSet<Integer>[] three = new HashSet[N];
        three[N-1] = new HashSet<>();
        for(int i = N-2; i > -1; i--){
            three[i] = new HashSet<>(three[i+1]);
            int ii = 100*(S[i]-'0');
            for(Integer j : two[i+1]){
                three[i].add(ii+j);
            }
            if(three[i].size() == 1000){
                for(int j = i-1; j > -1; j--){
                    two[j] = two[i];
                }
                System.out.println(1000);
                return;
            }
        }
        System.out.println(three[0].size());
    }

    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }

        String s(){
            try{return readLine();}catch(IOException e){return "";}
        }

        String[] ss(){
            return s().split(" ");
        }

        int i(){
            return Integer.parseInt(s());
        }

        int[] ii(){
            String[] ss = ss();
            int[] ii = new int[ss.length];
            for(int j = 0; j < ss.length; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }

        ArrayList<Integer> li(){
            String[] ss = ss();
            ArrayList<Integer> li = new ArrayList<>();
            for(int j = 0; j < ss.length; j++) li.add(Integer.parseInt(ss[j]));
            return li;
        }

        long l(){
            return Long.parseLong(s());
        }

        long[] ll(){
            String[] ss = ss();
            long[] ll = new long[ss.length];
            for(int j = 0; j < ss.length; j++) ll[j] = Long.parseLong(ss[j]);
            return ll;
        }
    }
}

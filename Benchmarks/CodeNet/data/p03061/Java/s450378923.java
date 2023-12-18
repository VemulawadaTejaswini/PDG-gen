import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str);
        str = br.readLine();
        ArrayList<Integer> A = new ArrayList<>();
        for (String s:str.split(" ")){
            A.add(Integer.parseInt(s));
        }
        ArrayList<Integer> l = new ArrayList<>();
        l.add(0);
        for (int i=0;i<N;i++){
            l.add(GCD(l.get(i),A.get(i)));
        }
        ArrayList<Integer> r = new ArrayList<>();
        r.add(0);
        for (int i=N-1;i>=0;i--){
            r.add(GCD(r.get(r.size()-1),A.get(i)));
        }
        Collections.reverse(r);
        ArrayList<Integer> gcd = new ArrayList<>();
        for (int i=0;i<N;i++){
            gcd.add(GCD(l.get(i),r.get(i+1)));
        }
        int max = 0;
        for (int i:gcd){
            if (i > max){
                max = i;
            }
        }
        System.out.println(max);
    }

    public static int GCD(int a,int b){
        if (b==0){
            return a;
        }
        if (a%b==0){
            return b;
        } else {
            return GCD(b,a%b);
        }
    }
}
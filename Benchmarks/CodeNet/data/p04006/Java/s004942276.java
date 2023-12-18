import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] s = line.split(" ");
                int n = Integer.parseInt(s[0]);
                int x = Integer.parseInt(s[1]);
                s = br.readLine().split(" ");
                int[] a = new int[n];
                for(int i=0; i<n; i++){
                    a[i] = Integer.parseInt(s[i]);
                }
                ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();
                for(int i=0; i<n; i++){
                    ArrayList<Integer> bi = new ArrayList<Integer>();
                    for(int k=0; k<n; k++){
                        if(k==0){bi.add(a[(n+i-k)%n]);}
                        else{
                            bi.add(Math.min(bi.get(bi.size() - 1), a[(n+i-k)%n]));
                        }
                    }
                    b.add(bi);
                }
                int min = Integer.MAX_VALUE;
                for(int k=0; k<n; k++){
                    int sum = 0;
                    for(int i=0; i<n; i++){
                        sum+=b.get(i).get(k);
                    }
                    if(k*x+sum<min){
                        min=k*x+sum;
                    }
                }
                System.out.println(min);
            }
        }
    }
}
import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

        int N = in.nextInt();
        int[] A = new int[N];
        
        for(int i=0;i<N;++i) {
            A[i]=in.nextInt();
        }

        int ans = 0;

        for(int i=0;i<N;++i) {
            for(int j=i+A[i]+1;j<N;++j) {
                if(A[i]+A[j]==j-i) {
                    ans+=1;
                }
            }
        }

        System.out.println(ans);

    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int n = Integer.parseInt(br.readLine());
            int[] A = new int[(n+1)/2];
            Arrays.fill(A,0);
            String st = br.readLine();
            String[] s = st.split(" ",0);
            int answer=0;
            int error = 0;
            for(int i = 0; i<n;i++){
                int a = Integer.parseInt(s[i]);
                A[a/2]++;
                if(A[a/2]>2 || (A[0]>1&&n%2==1)){
                    error++;
                    break;
                }
            }
            if(error==0){
            answer = (int)(Math.pow(2,n/2)%1000000007);
            }
            System.out.println(answer);
        }catch(Exception ex){
            System.exit(0);
        }
    }
}
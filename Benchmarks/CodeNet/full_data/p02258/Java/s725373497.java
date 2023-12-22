import java.io.*;
                
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] R = new int[t];
        int i, j, a, bnf;
        R[0] = Integer.parseInt(br.readLine());
        R[1] = Integer.parseInt(br.readLine());
        bnf = R[1] - R[0];
                
        for(i=2; i<t; i++){
            R[i] = Integer.parseInt(br.readLine());
                for(j=0; j<i; j++){
                    a = R[i] - R[j];
                if(bnf < a) bnf = a;
            }
        }
                 
        System.out.println(bnf);
    }
}
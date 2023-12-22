import java.io.*;
  
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int i, j;
        int count = 0;
  
        for(i=0; i<n; i++){
            int a = Integer.parseInt(br.readLine());
            for(j=(int)Math.sqrt((double)a); j>1; j--){
                if(a%j == 0) break;
            }
            if(j==0) count++;
        }
    }
}
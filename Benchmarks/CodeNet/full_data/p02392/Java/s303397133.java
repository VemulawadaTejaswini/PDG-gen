import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader r =
         new BufferedReader(new InputStreamReader(System.in), 1);
         
        String line = r.readLine();    
        String[] w = line.split(" ",0); 
        int a=Integer.parseInt(w[0]);
        int b=Integer.parseInt(w[1]);
        int c=Integer.parseInt(w[2]);
        
        if((0 <= a) & (a <= 100)) {
            if((0 <= b) & (b <= 100)){
                if((0 <= c) & (c <= 100)) {
                    if ((a < b) & (b < c)) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                 }
            }
        }
        r.close();
    }
}
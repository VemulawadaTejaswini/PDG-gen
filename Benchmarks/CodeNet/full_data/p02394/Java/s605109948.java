import java.io.*;

class Main{
    public static void main(String[] args) throws NumberFormatException,IOException{
        BufferedReader re =
         new BufferedReader(new InputStreamReader(System.in), 1);
          
        String line = re.readLine();    
        String[] w = line.split(" ",0);
        
        int W = Integer.parseInt(w[0]);
        int H = Integer.parseInt(w[1]);
        int x = Integer.parseInt(w[2]);
        int y = Integer.parseInt(w[3]);
        int r = Integer.parseInt(w[4]);
        
        String ret = "No";
        if (W>= (x+r) &&H>=(y+r)&& (x-r) >= 0 && (y-r) >= 0) ret = "Yes";   
        
        System.out.println(ret);
        re.close();
    }
}
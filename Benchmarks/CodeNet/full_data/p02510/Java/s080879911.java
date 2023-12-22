import java.io.*;
 
class Main {
    public static void main(String args[]) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            String s, t, u;
            int n, h;
            while(!(s = br.readLine()).equals("-")) {
                n = Integer.parseInt(br.readLine());
                for(int i = 0;i < n;i++) {
                    h = Integer.parseInt(br.readLine());
                    t = s.substring(0, h);
                    u = s.substring(h);
                    s = u+t;
                }
                System.out.println(s);
            }
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
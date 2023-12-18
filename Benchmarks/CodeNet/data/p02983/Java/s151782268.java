import java.io.*;
class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sb1 = br.readLine();
        String[] a = sb1.split(" ");
        long[] c = new long[a.length];
        long[] b = new long[a.length];
        long d  = 2019;
        for(int i = 0;i < a.length;i++){
            c[i] = Long.parseLong(a[i]);
        }
        for(int i = 0;i < a.length;i++){
            b[i] = c[i]/d;
        }
        
        if(c[1] < 2019){
            System.out.println(c[0] * (c[0] + 1));
        } else if(b[0] == b[1]){
            System.out.println((c[0] * (c[0] + 1) %2019));
        }  else {
            System.out.println(0);
        }
        
    }
}
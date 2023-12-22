import java.io.*;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        double dHankei = 0;
        double dEnsyuritu = Math.PI;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
         
        r = Double.parseDouble(str);
         
        double dMenseki = r * r * dEnsyuritu; 
        double dMawari = r * 2 * dEnsyuritu;
         
        String Answer1 = String.format("%.6f", dMenseki);
        String Answer2 = String.format("%.6f", dMawari);
         
        System.out.println(Answer1 + " " + Answer2);
    }
}
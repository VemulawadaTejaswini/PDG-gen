import java.io.*;

public class BoxesAndCandies {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = "AtCoder ";
        String b = " Contest";
        String s = br.readLine();
        String s1 = s.toLowerCase();
        String s2 = s1.substring(0,1).toUpperCase() + s1.substring(1);
        String name = a + s2 + b;
       
        System.out.println("A"+s2.charAt(0)+"C");
        
    }
}

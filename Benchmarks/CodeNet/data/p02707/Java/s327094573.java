import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)), false);
        DecimalFormat df = new DecimalFormat("0.000000000");
        int n = in.nextInt();
        int a[] = new int[n];a[0]=0;
        for(int i=1;i<n;i++) a[in.nextInt()-1]++;
        for(int i:a) out.println(i);
        
        in.close();out.flush();out.close();
    }
}
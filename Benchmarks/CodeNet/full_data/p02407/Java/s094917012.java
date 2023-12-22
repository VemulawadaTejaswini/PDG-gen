import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(br.readLine());

         String[] line = br.readLine().split(" ");
         
      	 int a[] = new int[line.length];
      	 
         for(int i=0;i<line.length;i++) {
        	 a[i] = Integer.parseInt(line[i]);
         }
         
         for(int i=n;i>0;i--) {
        	 System.out.print(a[i-1] + " ");
         }
    }

}

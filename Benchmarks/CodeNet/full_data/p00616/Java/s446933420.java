import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line;
            /* input */
            while(true){
                line = br.readLine();
                int n = Integer.parseInt(line.split(" ")[0]), h = Integer.parseInt(line.split(" ")[1]);
                if(n==0&&h==0) return;
                
                Set<Integer> s = new HashSet<Integer>();
                
                for(int i=0;i<h;i++){
                	line = br.readLine();
                	
                	String[] str = line.split(" ");
                	String p = str[0];
                	int a = Integer.parseInt(str[1])-1, b = Integer.parseInt(str[2])-1;
                	if(p.equals("xy")){
                		for(int j=0;j<n;j++){
                			s.add(1000000*a+1000*b+j);
                		}
                	} else if(p.equals("yz")){
                		for(int j=0;j<n;j++){
                			s.add(1000000*j+1000*a+b);
                		}
                	} else {
                		for(int j=0;j<n;j++){
                			s.add(1000000*a+1000*j+b);
                		}
                	}
                }
                System.out.println(n*n*n-s.size());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
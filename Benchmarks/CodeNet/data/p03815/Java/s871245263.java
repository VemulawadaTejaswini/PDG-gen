import java.io.*;
 
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Long x=Long.parseLong(br.readLine());
        Long sum=(x/11L)*2L;
        x%=11L;
        if(x>0){ sum+=(x>5) ? 2:1; }
        System.out.println(sum);
    }
    
}
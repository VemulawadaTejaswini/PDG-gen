import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] written = br.readLine().split("");
        String[] target  = new String[]{"C","O","D","E","F","E","S","T","I","V","A","L","2","0","1","6"};
        int change = 0;
        for(int i=0;i<16;i++){
        	if(!written[i].equals(target[i])) change++;
        }
        
        System.out.println(change);
    }
}
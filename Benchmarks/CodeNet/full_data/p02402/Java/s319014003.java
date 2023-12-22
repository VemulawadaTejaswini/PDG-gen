import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int x = 0;
        long sum = 0;
        ArrayList<Integer> num = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        for(int i = 0; i < 2; i++) {
            if(i == 0){
                String[] line = br.readLine().split(" ");
                x = Integer.parseInt(line[0]);
            }
             
            else{
                String[] line = br.readLine().split(" ");
                for(int a = 0; a < x; a++){
                    sum = sum + Integer.parseInt(line[a]);
                    num.add(Integer.parseInt(line[a]));
                }
            }
             
        }
         
        System.out.println(Collections.min(num) +" "+ Collections.max(num) +" "+ sum);
         
 
         
    }
 
}
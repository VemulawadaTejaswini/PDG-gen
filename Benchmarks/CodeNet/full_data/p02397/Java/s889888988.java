import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        
        String[] ary = new String[2];
        int[] num = new int[2];
        
        while(true){
            ary = br.readLine().split(" ");
            //ary = inputStr.split(" ");
            num[0] = Integer.parseInt(ary[0]);
            num[1] = Integer.parseInt(ary[1]);
            
            if(num[0] == 0 && num[1] == 0){
                break;
            }
            
            if(num[0] > num[1]){
                System.out.println(num[1] + " " + num[0]);
            }else{
                System.out.println(num[0] + " " + num[1]);
            }
        }
        
    }
}
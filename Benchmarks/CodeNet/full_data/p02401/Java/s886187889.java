import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String str = br.readLine();
    
        while(str != null){
        String[] tempStr = str.split("\\s");
        int n1 = Integer.parseInt(tempStr[0]);
        String op = tempStr[1];
        int n2 = Integer.parseInt(tempStr[2]);

        
            if(!(op.equals("?"))){
                int out = calc(n1,op,n2);
                System.out.println(out);
                str = br.readLine();
            }else{
                break;
            }
        }
       
    }

    public static int calc(int n1,String op,int n2){        

        if(op.equals("+")){
            int ans = n1 + n2;
            return ans;
        }

        if(op.equals("-")){
            int ans = n1 - n2;
            return ans;
        }        

        if(op.equals("*")){
            int ans = n1 * n2;
            return ans;
        }

        if(op.equals("/")){
            int ans = n1 / n2;
            return ans;
        }else{
            return 0;
        }
    }
}
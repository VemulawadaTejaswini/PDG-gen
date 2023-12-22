import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main{
    public static void main(String[] a) throws Exception {
 
         InputStreamReader in = new InputStreamReader(System.in);
         BufferedReader reader = new BufferedReader(in);
         
     
        String input = reader.readLine();
             
            int ctr = 0;
            int primectr = 0;
            int remainder = 0;
            while ((input!=null) && ctr < 30) {
                int num = Integer.parseInt(input);
                int tempnum = num;
                primectr = 0;
                if (num > 1){
                    primectr = 1;
                }
                for (int y = tempnum; y > 2; y--){
                    for (int x = 2; x <= y; x++){
                        remainder = y % x;
                        if (remainder == 0) {
                            break;
                        }else{
                            if (x + 1 == y){
                                primectr = primectr + 1;
                                 
                            }
                        }
                     
                    }
                     
                    ctr = ctr + 1;
                }
                input = reader.readLine();
                System.out.println(primectr);
            }   
         
    }
}
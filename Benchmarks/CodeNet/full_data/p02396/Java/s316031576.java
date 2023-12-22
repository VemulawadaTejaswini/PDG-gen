import java.io.*;

public class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        
        int k = 0;
        
        while(true){
            int num = Integer.parseInt(br.readLine());
            
                if(num != 0){
                    k++;
                    String Ans ="Case " + k +": " + num; 
                    System.out.println(Ans);
                }

            }
        }
    }
}
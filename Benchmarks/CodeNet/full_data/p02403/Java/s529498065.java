import java.io.*;

public class Main{
    public static void main(String[]args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String crlf = System.getProperty("line.separator");
       
    
        
        while(true){
            String[] str = br.readLine().split(" ");
            int h = Integer.parseInt(str[0]);
            int w = Integer.parseInt(str[1]);
           
            if(h==0 && w==0){
                break;
            }else{
                for(int i=0;i<h;i++){
                    for(int j=0;j<w;j++){
                        System.out.print("#");
                    }
                    System.out.println();
                }
                
            }
            System.out.println();
        }
        
        
        
        
    }
}
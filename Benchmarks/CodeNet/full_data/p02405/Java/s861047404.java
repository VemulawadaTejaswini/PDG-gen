import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sbu=new StringBuilder();
        
        while(true){
            String[] num=buf.readLine().split(" ");
            int h=Integer.parseInt(num[0]);
            int w=Integer.parseInt(num[1]);
            
            if(h==0 && w==0)break;
            
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    if((i+j)%2==0)
                        sbu.append("#");
                    else
                        sbu.append(".");
                }
                sbu.append("\n");
            }
            sbu.append("\n");
        }
        System.out.print(sbu);
    }
}
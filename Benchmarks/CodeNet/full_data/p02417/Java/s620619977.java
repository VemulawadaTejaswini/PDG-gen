import java.io.*;
 
public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int[] counter=new int[26];
        String text;
        
        while((text=br.readLine())!=null){
            for(int i=0;i<text.length();i++){
                char character=Character.toLowerCase(text.charAt(i));
                char alpha='a';
                for(int j=0;j<counter.length;j++){
                    if(character==alpha){
                        counter[j]++;
                    }
                    alpha++;
                }
            }
        }
        
        char alpha='a';
        for(int i=0;i<counter.length;i++){
            System.out.println(alpha+" : "+counter[i]);
            alpha++;
        }
        
    }
}
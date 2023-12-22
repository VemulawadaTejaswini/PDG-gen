import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;
        char[] firstinput=new char[1200];
        int[] counter=new int[150];
        
        
        while((str=br.readLine())!=""){
            firstinput=str.toCharArray();
            for(int i=0;i<firstinput.length;i++){
                for(int j=97;j<=122;j++){
                    if(firstinput[i]==(char)(j)||firstinput[i]==Character.toUpperCase((char)(j))){
                        counter[j]++;
                    }
                }
            }
            System.out.println("test");
        }
        
        for(int i=97;i<=122;i++){
            System.out.println((char)(i)+":"+counter[i]);
        }
        
        return;
    }
}
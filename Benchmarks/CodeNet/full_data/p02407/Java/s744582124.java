import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        int n = Integer.parseInt(str);
        
        str = br.readLine();
        String[] temp = str.split("\\s");
        int[] Suretu = new int[n];
        
        for(int i=0;i<n;i++){
            Suretu[i]=Integer.parseInt(temp[i]);
        }
       
        for(int i= n-1;i=0;i--){
            System.out.println(Suretu[i]);
        }

    }

    
}
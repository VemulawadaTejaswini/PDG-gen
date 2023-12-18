import java.util.*;
import java.io.*;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        
         int a=0;
        int b=0;
        int k=0;
        
         try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(" ");
                a = Integer.parseInt(tokens[0]);
                b = Integer.parseInt(tokens[1]);
                k = Integer.parseInt(tokens[2]);
            
            }
        }          
               
            int[] ary = IntStream.of(a,b,k).sorted().toArray();
            int cnt=0;

            while(ary[1]<ary[2]){
                ary[0]=ary[0]+1;
                ary[1]=ary[1]+1;
                cnt++;
               
               
            if(ary[0]+1==ary[2]){
              ary[0]=ary[0]+2;
              cnt++;
              ary[1]=ary[1]+1;
              ary[2]=ary[2]+1;
              cnt++;

    }
               
               
               
                
            }   
            


            while(ary[0]<ary[2]){
                ary[0]=ary[0]+2;
                cnt++;

            }


        System.out.println(cnt);



    }
}
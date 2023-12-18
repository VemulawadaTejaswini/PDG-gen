import java.util.*;
import java.io.*;

class Main
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader br = 
     new BufferedReader(new InputStreamReader(System.in));
    String S = br.readLine();

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int count = 0;  

    for(int i=0; i<10; i++){
       for(int j=0; j<10; j++){
          for(int k=0; k<10; k++){
             int a = i*100 + j*10 + k;
          
             int bi = S.indexOf(i);
             int bj = S.indexOf(j);
    
             if(bi<bj){

               int bk = S.indexOf(k);

               if(bj<bk){
                 count++;
               }
               else{
                 continue;
               }
             }
             else{
               continue;
             }

             System.out.println(count);
          }
       }
    }
  }
}


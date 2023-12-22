import java.io.*;

public class Main {

    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
           String str;
           int i = 0;
           while((str = br.readLine())!=null&&i<30){
               int x = Integer.parseInt(str);
               int count = 0;
               if(0<x&&x<1000000){
                   int [] prime = new int[x];
                   if(1<x) prime[count++]=2;
                   if(2<x) prime[count++]=3;
                   if(4<x){
                       for(int n=5;n<x+1;n+=2){
                           boolean bo = false;
                           for(int j = 1;Math.pow(prime[j], 2)<=n;j++){
                               if(n%prime[j]==0){
                                   bo = true;
                                   break;
                               }
                           }
                           if(!bo){
                               prime[count++]=n;
                           }
                       }
                   }
                   System.out.println(count);
               }
               i++;
           }
        } catch (IOException ex) {
            System.out.println("error");
        }
    }
}
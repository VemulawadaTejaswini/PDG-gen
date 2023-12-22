import java.io.*;
import java.util.*;
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            try{
                System.out.println(prime_number(Integer.parseInt(br.readLine())));
            }catch(Exception e){
                System.exit(0);
            }
        }
    }
    
    static int prime_number(int n){
        boolean[] array=new boolean[n+1];
        Arrays.fill(array, true);
        int i=2;
        array[0]=false;
        array[1]=false;
        while(Math.pow(i, 2)<=n){
            int j=i+i;
            while(j<=n){
                array[j]=false;
                j+=i;
            }
            i++;
        }
        
        int count=0;
        for(i=0;i<array.length;i++){
            if(array[i]) count++;
        }
        
        return count;
    }
}
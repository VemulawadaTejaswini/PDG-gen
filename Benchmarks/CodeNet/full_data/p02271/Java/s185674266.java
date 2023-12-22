import java.io.*;
import java.util.*;


//I have to use hashset
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        
        int n = Integer.parseInt(br.readLine());
        str = br.readLine();

        String[] A = str.split("\\s");
        int q = Integer.parseInt(br.readLine());
        str = br.readLine();

        String[] mi = str.split("\\s");

        int[] flags = new int[q];

        for(int i=0;i<q;i++){
            int num = Integer.parseInt(mi[i]);
            for(int j=0;j<n-1;j++){
                int temp1 = Integer.parseInt(A[j]);
                int sum = temp1;
                if(num == temp1){
                    flags[i]+=1;
                }
                for(int k=j+1;k<n;k++){
                    int temp2 = Integer.parseInt(A[k]);
                    sum += temp2;
                    if(num == (temp1+temp2)){
                        flags[i]+=1;
                    }else if(num == sum){
                        flags[i]+=1;
                    }
                }
            }
        }

        for(int i=0;i<q;i++){
            if(flags[i] > 0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
        

    }    
}


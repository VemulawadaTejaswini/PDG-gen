import java.io.BufferedReader;
import java.io.*;

public class Main{
    public static void solution(int[] array,int n,int m){
        int i,j,max,temp;
        max = 0;
        for (i=0;i<n;i++){
            for (j=i+1;j<n;j++){
                temp = array[i] + array[j];
                //System.out.print(temp+" ");
            if (temp > max && temp <= m) max = temp;
            }
        }
        if (max == 0){
            System.out.println("NONE");
        }else{
            System.out.println(max);
        }
    }
    public static void main(String[] args){
        //final String FILENAME = "atest.txt";
        BufferedReader br = null;

        try{
            br = new BufferedReader(new InputStreamReader(System.in));
            String curr;
            while(!(curr = br.readLine()).equals("0 0")){
                String[] nm = curr.split(" ");
                int n = Integer.parseInt(nm[0]);
                int m = Integer.parseInt(nm[1]);
                curr = br.readLine();
                String[] a = curr.split(" ");
                int[] array = new int[1024];
                //System.out.println("ARRAY");
                for (int i = 0; i < n ; i++){
                    array[i] = Integer.parseInt(a[i]);
                    //System.out.print(array[i]+" ");
                }
                //System.out.println();
                solution(array,n,m);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

import java.io.*;
import java.util.*;
import java.net.*;
public class Main extends Thread {
    public static void main (String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] array=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            array[i]=Integer.parseInt(st.nextToken());
        }for(int i=0;i<n;i++){
            if(array[i]<array[array[i]-1]){
                if(array[array[array[i]-1]-1]==array[i]) count++;
            }
        }System.out.println(count);
    }
    
}
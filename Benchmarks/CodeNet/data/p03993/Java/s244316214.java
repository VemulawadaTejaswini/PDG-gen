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
            for(int j=i+1;j<n;j++){
                if(array[i]==j+1&&array[j]==i+1) count++;
            }
        }System.out.println(count);
    }
    
}
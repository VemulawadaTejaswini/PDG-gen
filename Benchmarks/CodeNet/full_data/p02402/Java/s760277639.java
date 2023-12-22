import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line = reader.readLine();
            int n = Integer.parseInt(line);
            int data[] = new int[n];
            Scanner sc = new Scanner(System.in);
            int i;
            for(i=0; i<n; i++){
                data[i] = sc.nextInt();
            }
            int min,max,sum=0;
            min = data[0];
            max = data[0];
            for(i=0; i<n-1; i++){
                if(data[i] < data[i+1]) max = data[i+1];
                if(data[i] > data[i+1]) min = data[i+1];
            }
            for(i=0; i<n; i++){
                sum += data[i];
            }
            System.out.printf("%d %d %d\n", min, max, sum);
        } catch(IOException e){
            System.out.println(e);
        }
    }
}

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)  throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int counter = 0;
        int N = Integer.parseInt(in.readLine());
        int arr[] = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i < N; i++){
            if(i%2==0 && arr[i]%2!=0){
                counter++;
            }
        }
System.out.println(counter);
    }
    
}

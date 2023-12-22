import java.io.*;
public class REN06{

    public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    String[] arr = str.split(" ");
    int a = Integer.parseInt(arr[0]);
    int b = Integer.parseInt(arr[1]);
    int c = Integer.parseInt(arr[2]);

    int count = 0;

    for(int i = a; i <= b; i++){
        if(c % i == 0){
        count++;
        }
    }

    System.out.println(count);

    }
  }
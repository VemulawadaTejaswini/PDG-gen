import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] a){
    try{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String[] pp  = str.split(" ");
        int x = Integer.parseInt(pp[0]);
        int b = Integer.parseInt(pp[1]);
        int c = Integer.parseInt(pp[2]);
        if(x<b && b<c){
           System.out.println("YES");          
}else{
System.out.println("NO");
        }
    }catch(IOException e){
     e.printStackTrace();
    }
}
}
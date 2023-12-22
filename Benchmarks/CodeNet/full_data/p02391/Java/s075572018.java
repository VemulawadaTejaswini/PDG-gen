import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

public static void main(String[] args)throws IOException
 {
 try{
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String str = reader.readLine();
String[]array =str.split("");
int a =Integer.parseInt(array[0]);
int b =Integer.parseInt(array[1]);

if(a>b){
System.out.println("a > b");
}else if(a<b){
System.out.println("a < b");
}else{
System.out.println("a == b");
} catch(IOException e) {
System.err.println(e);
}

}
}
}
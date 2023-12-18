import java.io.*;
import java.util.*;

public class Main{
public static void main(String arg[])throws Exception{
BufferedReader bff = new BufferedReader(new InputStreamReader(System.in));
PrintWriter wff = new PrintWriter(System.out);

String cad = bff.readLine();

if(cad.indexOf("AC") != -1){
wff.println("Yes");
}
else{
wff.println("No");
}
wff.flush();
}
}
import java.io.*;

class Main{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String line="";
while((line=br.readLine())!=null){
line=line.replaceAll("apple","?????????");
line=line.replaceAll("peach","apple");
line=line.replaceAll("?????????","peach");
System.out.println(line);
}
}
}
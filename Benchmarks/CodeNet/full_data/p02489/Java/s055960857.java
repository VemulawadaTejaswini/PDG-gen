import java.io.*;
class Main{
 public static void main(String[] args)throws IOException{

InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);
int i = 1;
while(true){
String str = br.readLine();
if(str.equals("0"))
 break;
System.out.println("Case " + i + ": "+ str);
i++;
}

}
}
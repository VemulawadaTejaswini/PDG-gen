import java.util.Scanner;
import java.io.*;
class Main {
public static void main(String[] args)throws IOException{
int[] blood = new int[4];
BufferedReader br = new BufferedReader(new　InputStreamReader(System.in));
String buf;
while((buf = br.readLine())!=null){
&#160; &#160; &#160; &#160; &#160; &#160; String b = buf.split(",")[1];
&#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; if("A".equals(b))
&#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; blood[0]++;
&#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; else if("B".equals(b))
&#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; blood[1]++;
&#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; else if("AB".equals(b))
&#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; blood[2]++;
&#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; else
&#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; &#160; blood[3]++;
&#160; &#160; &#160; &#160; }
&#160; &#160; &#160; &#160; for(int i =0; i<blood.length;i++){
&#160; &#160; &#160; &#160; &#160; &#160; System.out.println(blood[i]);
&#160; &#160; &#160; &#160; }
&#160; &#160; }
}
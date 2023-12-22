import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{
  double r;
  String area,rect;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  
   String str = br.readLine(); 
   String[] strAry = str.split(" ");
   r = Doubleeger.parseDouble(strAry[0]);  
   area = r*r*3.141592653589;
   rect = 2*r*3.141592653589;
   area=String.format("%.5f", r*r*3.141592653589);    
   rect=String.format("%.5f", 2*r*3.141592653589);    
   
   System.out.println(area + " "+ rect); 
 }
}
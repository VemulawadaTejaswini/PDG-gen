import java.io.*;

class Main{
 public static void main(String[] args)throws IOException{
  int x,y;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  
  
  
  while(true){
    String str = br.readLine(); 
    String[] strAry = str.split(" ");
    x = Integer.parseInt(strAry[0]);  
    y = Integer.parseInt(strAry[1]);   
    if(x==0&&y==0) break;   
    if(x<=y){
      System.out.println(x +" "+ y);
     
    }else{    
      System.out.println(y +" "+ x);
     }
  }
 }
}
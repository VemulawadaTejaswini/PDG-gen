import java.io.*;

class Main{
  public static void main(String[] args){
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
    try{
      String str1 = br.readLine();
      int a = Integer.parseInt(str1);
    
          String str2 = br.readLine();
      int b = Integer.parseInt(str2);
    
          String str3 = br.readLine();
      int x = Integer.parseInt(str3);
    
    	if(a>x || (a<x && b==0) || (a+b<x) ){
      		System.out.println("No");
    	}else{
      		System.out.println("Yes");
    	}
    }catch(Exception e){
      System.out.println("無効な数字です");
     }
    
  }
}
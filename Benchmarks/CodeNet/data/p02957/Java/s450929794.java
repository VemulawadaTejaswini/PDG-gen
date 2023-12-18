import java.io.*;
import java.util.ArrayList;
//password:53VHEnd4
public class Main{
  public static void main(String args[]){
    String str;
          int limit=(int)Math.pow(10,9);
    try{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in,"UTF-8"));
      str=br.readLine();
      String[] numstr = str.split(" ");
      int[] num=new int[2];
      for(int i=0;i<2;i++){
        num[i]=Integer.parseInt(numstr[i]);
      }
      int ans=calAbs(num);
      if(ans==limit){
        System.out.println("IMPOSSIBLE");
      }else{
      System.out.println(ans);
    }
    }catch(IOException e){
      e.printStackTrace();
    }
  }

    public static int calAbs(int[] num){
      int i=0;
      int a,b;
      int limit=(int)Math.pow(10,9);
      while(true){
      a=Math.abs(num[0]-i);
      b=Math.abs(num[1]-i);
      if(a==b||i==limit)break;
      i++;
    }
    return i;
    }

}

import java.io.*;
import java.util.ArrayList;
//password:53VHEnd4
public class Main{
  public static void main(String args[]){
    String str;
    try{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in,"UTF-8"));
      str=br.readLine();
      int length=Integer.parseInt(str);
      str=br.readLine();
      String[] arraystr = str.split(" ");
      int[] monster=new int[length+1];
      for(int i=0;i<length+1;i++){
        monster[i]=Integer.parseInt(arraystr[i]);
      }
      str=br.readLine();
      arraystr = str.split(" ");
      int[] human=new int[length];
      for(int i=0;i<length;i++){
        human[i]=Integer.parseInt(arraystr[i]);
      }
      int ans=check(human,monster);
        System.out.println(ans);

    }catch(IOException e){
      e.printStackTrace();
    }
  }
  public static int check(int[] human,int[] monster){
    int count=0;
    for(int i=0;i<human.length;i++){
      if(monster[i]<human[i]){
        count+=monster[i];
        if(monster[i+1]<human[i]-monster[i]){
          count+=monster[i+1];
          monster[i+1]=0;
        }else{
          count+=human[i]-monster[i];
          monster[i+1]-=human[i]-monster[i];
        }
}else{
  count+=human[i];
  monster[i]-=human[i];
}
    }
      return count;

  }
}

import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    //number of musics
    int mNum = sc.nextInt();
    //music list
    String [] mList = new String[mNum];
    //time list
    int [] tList = new int[mNum];
    
    for (int i = 0; i < mNum; i++){
      mList[i] = sc.next();
      tList[i] = sc.nextInt();
    }
    
    //start to sleep
    String music = sc.next();
    
    //sleeping time
    int sTime = 0;
    
    //awake or sleep
    boolean sleep = false;
    
    for (int i = 0; i < mNum; i++){
      if(sleep){
        sTime += tList[i];
      }else if(mList[i].equals(music)){
        sleep = true;
      }
    }
    
    System.out.println(sTime);
    
  }
}
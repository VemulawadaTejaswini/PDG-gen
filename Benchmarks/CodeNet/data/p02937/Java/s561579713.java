import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    long page = 0;
    int gaze = -1;
    for(int i=0;i<t.length();i++){
      int will = s.indexOf(t.charAt(i),gaze+1);
      if(will==-1){
        will = s.indexOf(t.charAt(i));
        if(will==-1){
          System.out.println(-1);
          return;
        }
        page++;
      }
      gaze=will;
    }
    System.out.println(page*s.length()+gaze+1);
  }
}
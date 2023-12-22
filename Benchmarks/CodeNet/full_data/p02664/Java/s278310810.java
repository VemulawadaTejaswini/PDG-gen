import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    char[] c=str.toCharArray();

    for(int i=0;c.length>i;i++){
      if(c[i]=='P' || c[i]=='D') continue;
      else c[i]='D';
    }
    /*int countD=0;
    int countPD=0;
    for(int i=0;c.length>i;i++){
      if(c[i]=='D') countD++;
      else continue;
    }
    for(int i=0;c.length>i;i++){
      int j=1;
      if(c[i]=='P' && c[j]=='D') countPD++;
      else continue;
      j++;
    }*/
    System.out.println(c);
  }
}
import java.util.*; 

class Main{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    String ans=""; int count =0;
    String one =scn.next();
    String two =scn.next();
    for(int i=0;i<one.length();i++){
      if(one.charAt(i)!=two.charAt(i)){
        String a=String.valueOf(one.charAt(i));
        ans=ans+a;
        count++;
        continue;
      }
    }   
    System.out.println(count);
  }
}
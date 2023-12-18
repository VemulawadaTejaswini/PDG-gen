import java.util.*;
public class Main {

 public static void main(String[] args) {
  Scanner no=new Scanner(System.in);
  String s=no.next();
  int y=s.length()-1;
  int i=y;
  for(i=y;i>=0;i--){
    if(s.charAt(i)=='m'){
      String r=s.substring(i-4,i+1);
      if(r.equals("dream")){
        i=i-4;
      }
      else{
        System.out.println("NO");
        break;
      }
    }
    else if(s.charAt(i)=='e'){
      String r=s.substring(i-4,i+1);
      if(r.equals("erase")){
        i=i-4;
      }
    }
    else if(s.charAt(i)=='r'){
      String r=s.substring(i-6,i+1);
      String r1=s.substring(i-5,i+1);
      if(r.equals("dreamer")){
        i=i-6;
      }
      else if(r1.equals("eraser")){
        i=i-5;
      }
      else{
        System.out.println("NO");
        break;
      }
    }
    else{
      System.out.println("NO");
      break;
    }
  }
  //System.out.println(i);
  if(i==-1){
    System.out.println("YES");
  }
 }

}

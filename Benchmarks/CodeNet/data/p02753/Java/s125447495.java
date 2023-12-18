import java.util.*;
import java.lang.*;
class Solution{
public static void main(String [] args){
Scanner in = new Scanner(System.in);
  String s = in.next();
  int ca=0;
  int cb=0;
  for(int i =0;i<s.length();i++){
  if(s.charAt(i)=='A'){
  ca++;
  }
    if(s.charAt(i)=='B'){
  cb++;
  }
  }
  if(ca==3 || cb==3){
  System.out.print("No");
  }
  else{
  System.out.print("Yes");
  }
}
}
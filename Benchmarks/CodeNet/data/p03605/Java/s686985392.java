import java.util.*;

class Main {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
String a = sc.next();
String ans = "No";
for(int i = 0;i < a.length();i++){
  if(a.sustring(i,++i).equals("9")){
    ans = "Yes";
  }
}
System.out.println(ans);

}
}
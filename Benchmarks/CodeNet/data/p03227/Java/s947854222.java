import java.util.*;
public class Main{
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
String S=sc.next();
String ans; 
if(S.length()==2){
ans=S;
}
else{
        ans=S.substring(2,3)+S.substring(1,2)+S.substring(0,1);
        }
System.out.println(ans);
    }
}
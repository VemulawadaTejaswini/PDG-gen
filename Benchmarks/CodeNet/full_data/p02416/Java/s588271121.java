import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
while(true){
 int ans=0;
 String r=sc.next();
   if(r.equals("0"))break;
for(int i=0;i<r.length();i++){
    ans+=Character.getNumericValue(r.charAt(i));
}
 
 
 System.out.println(ans);
}
}
}

import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String s = sc.next();

int l =0;
int r = 0;
for(int  i=0;i<s.length() ;i++){
if('A'==s.charAt(i)) {
  
l = i;
break;
}
}
for(int i=s.length()-1;0<i;i--){
if('Z'==s.charAt(i)){



r=i;
break;
}
}
System.out.println(r-l+1);

} 
}
import java.util.*;

public class Main{
public static void main(String[] args){
Scanner obj=new Scanner(System.in);
String s=obj.next();
String t=obj.next();
int count=0;

int a=0;
int b=0;

while(b<t.length()){
  
  if(a==s.length()){
       a=0;
   }

 if(s.indexOf(t.charAt(b))==-1){
System.out.println(-1);
break;
}
   if(s.charAt(a)==t.charAt(b)){
        b++;
     }
a++;
count++;
}
System.out.println(count);
}


}

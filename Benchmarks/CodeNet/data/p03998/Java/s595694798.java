import java.util.*;

class Main {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
String a = sc.next();
String b = sc.next();
String c = sc.next();

String field = a.substring(0,1);
a = a.substring(1);

for(;!(a.equals("")||b.equals("")||c.equals(""));){
if(field.equals("a")){
field = a.substring(0,1);
a = a.substring(1);
}else if(field.equals("b")){
field = b.substring(0,1);
b = b.substring(1);
}else{
field = c.substring(0,1);
c = c.substring(1);
}
}
if(a.equals("")){
System.out.println("A");
}else if(b.equals("")){
System.out.println("B");
}else{
System.out.println("C");
}

}
}
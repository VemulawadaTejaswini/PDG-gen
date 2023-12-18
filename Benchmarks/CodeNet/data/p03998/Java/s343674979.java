import java.util.*;

class Main {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
String a = sc.next();
String b = sc.next();
String c = sc.next();

int win = 0;

String field = a.substring(0,1);
a = a.substring(1);

for(;;){
if(field.equals("a")){
if(a.equals("")){
win = 1;
break;
}
field = a.substring(0,1);
a = a.substring(1);
}else if(field.equals("b")){
if(b.equals("")){
win = 2;
break;
}
field = b.substring(0,1);
b = b.substring(1);
}else{
if(c.equals("")){
win = 3;
break;
}
field = c.substring(0,1);
c = c.substring(1);
}
}
if(win == 1){
System.out.println("A");
}else if(win == 2){
System.out.println("B");
}else{
System.out.println("C");
}

}
}
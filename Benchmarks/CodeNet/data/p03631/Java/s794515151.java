import java.util.*;

class Main {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
String N = sc.next();
String a = N.substring(0,1);
String b = N.substring(2,3);
if(a.equals(b)){
    System.out.println("Yes");
}else{
    System.out.println("No");
}

}
}
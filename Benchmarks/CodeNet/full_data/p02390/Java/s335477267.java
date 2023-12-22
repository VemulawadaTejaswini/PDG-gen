import java.lang.*;
import java.util.*;

class Main{
public static void main(String[] args){
Scanner stdId = new Scanner(System.in);
int a = stdId.nextInt();
System.out.println(a/3600 +":" + (a%3600)/60 +":" + a%60);




}
}
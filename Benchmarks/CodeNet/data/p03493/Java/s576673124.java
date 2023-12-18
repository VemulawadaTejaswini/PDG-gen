import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int Stone=0;
String S=sc.next();
for(int i=0;i<3;i++){
if(S.charAt(i)=='1')Stone++;
}
System.out.println(Stone);
}
}
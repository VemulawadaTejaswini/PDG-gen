
import java.util.*;
public class Main {
public static void maik(String[] args) {
String s = new Scanner(System.in).next();
char[] c = s.toCharArray();
int count = 0;
for(char ch:c){
if(ch=='1'){
count++;
}
System.out.println(count);
}
}
}
import java.util.*;
public class Main{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int i = sc.nextLong();
long a = 1;
for(;i>0;i--){
a *= i;
}
System.out.println(a);
}
}
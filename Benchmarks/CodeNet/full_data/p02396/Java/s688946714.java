import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int i=0;
for(;;){
int n =sc.nextInt();
if(n==0) break;
i++;
System.out.println("Case "+i+": "+n);
}
}
}
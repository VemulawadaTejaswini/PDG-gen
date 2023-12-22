import java.util.*;
public class Main {
 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int s=sc.nextInt();
for(;;){
	int t=s;
	s-=sc.nextInt();
	if(s==t)break;
}
System.out.println(s);
 }
}
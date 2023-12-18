import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int a = sc.nextLong();
        int b = sc.nextLong();
if(b / 100 >= 10 ) a *= 1000;
else if (b / 10 > 1 ) a *= 100;
else a *= 10;
a = a + b;
for(int i=1; i<a ; i++){
  if(i*i > a) System.out.print("No");
  break;
  if(i*i == a)System.out.print("Yes");
}
}
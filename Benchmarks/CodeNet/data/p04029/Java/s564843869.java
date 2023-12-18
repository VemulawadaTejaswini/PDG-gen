import java.util.*;
public class b043 {
public static void main (String argv[]){
Scanner input=new Scanner (System.in);
int n=input.nextInt();
int sum=0;
for (int i=0;i++<n;)
    sum+=i;
System.out.print(sum);
}
}
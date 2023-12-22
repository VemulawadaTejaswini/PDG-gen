import java.util.*;

public class Main{
   public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
int a,b;
while(sc.hasNext()){
int n1=sc.nextInt();
int n2=sc.nextInt();
a=Math.max(n1,n2);
b=Math.min(n1,n2);
for(;;){
a =a%b;
if(a==0)break;
int temp=b;
b=a;
a=temp;
}
System.out.println(b+" "+(long)n1*n2/b);
   }
   }
}
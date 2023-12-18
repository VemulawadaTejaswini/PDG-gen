import java.util.*;
class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
long a=s.nextLong();
long b=s.nextLong();
long c=s.nextLong();
long count=0;
for(long i=a;i<=b;i++){
if((i%c)==0){
count++;
}
} 
System.out.println(count);  
}
}
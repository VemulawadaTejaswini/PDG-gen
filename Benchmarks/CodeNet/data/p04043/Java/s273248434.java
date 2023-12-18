import java.util.*;
public class Main{
 
public static void main(String[] args){
int f=0;
int s=0;
Scanner x= new Scanner(System.in);
for(int i=0;i<3;i++){
if(x.nextInt() == 5)
f++;
if(x.nextInt()==7)
s++;
 
}
if(s==1 &&f==2)
System.out.print("TRUE");
System.out.print("FALSE");
}
 
}
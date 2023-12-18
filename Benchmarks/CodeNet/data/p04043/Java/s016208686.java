import java.util.*;
public class Main{
 
public static void main(String[] args){
int f=0;
int s=0;
Scanner x= new Scanner(System.in);
for(int i=0;i<3;i++){
if(x.nextInt() == 5)
f++;
else
s++;
 
}
if(s==1 &&f==2)
System.out.print("YES");
System.out.print("NO");
}
 
}
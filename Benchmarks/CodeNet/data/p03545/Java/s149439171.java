import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner stdIn=new Scanner(System.in);
String s=stdIn.next();
int a[]=new int[4];
char plus[]={'-','-','-'};
int z=0,y=2,sum=0;
while(z<4){
a[z]=Integer.valueOf(s.substring(z,z+1));
z++;
}z=0;
while(z<Math.pow(2,3)){
s=Integer.toBinaryString(z);
while(y<s.length()){
if(s.charAt(y)=='1')
  plus[2-y]='+';
else
  plus[2-y]='-';
y++;
}sum=a[0];y=0;
while(y<3){
if(plus[y]=='+')
  sum+=a[y+1];
else
  sum+=a[y+1];
y++;
}
if(sum==7)
  break;
y=0;z++;
}
System.out.println(a[0]+""+plus[0]+""+a[1]+""+plus[1]+""+a[2]+""+plus[2]+""+a[3]);
}
}
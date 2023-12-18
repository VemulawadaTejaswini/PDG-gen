import java.util.*;
class Main{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
int M=m;
for(int i=1;i<n;i++){
int a=s.nextInt();
if(a<m)m=a;
else if(a>M)M=a;
}
System.out.println(M-m);
}}
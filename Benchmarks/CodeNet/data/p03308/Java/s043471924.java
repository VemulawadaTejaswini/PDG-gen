import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=sc.nextInt();
int a1=sc.nextInt();
int max=a1;
int min=a1;
for(int i=2;i<=N;i++){
  int a = sc.nextInt();
if(max<a)
max=a;
if(min>a)
min=a;
}
System.out.println(max-min);
}
}

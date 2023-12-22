import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int MAX=1000000;
int count=0;
boolean[] prime=new boolean[MAX];
prime[0]=false;
prime[1]=false;
while(sc.hasNextInt()){
int n=sc.nextInt();
for(int i=2;i<=n;i++){
prime[i]=true;
}
for(int i=0;i<=n;i++){
if(prime[i]){
count++;
for(int j=i+i;j<=n;j+=i){
prime[j]=false;
}
}
}
}
System.out.println(count);
}
}
}
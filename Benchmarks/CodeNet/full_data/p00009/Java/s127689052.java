import java.util.*;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num=0;
while(sc.hasNextInt()){
int n=sc.nextInt();
boolean[] prime=new boolean[n];
if(n>3){
for(int i=2;i<n;i++){
prime[i]=true;
}
for(int i=2;i<n;i++){
if(prime[i]){
num++;
for(int j=2*i;j<n;j+=i){
prime[j]=false;
}
}
}
}
else{
prime=n-1;
}
System.out.println(num);
}
}
}
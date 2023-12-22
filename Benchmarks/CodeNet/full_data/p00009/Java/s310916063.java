import java.util.Scanner;
     
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
while(sc.hasNextInt()){
int n=sc.nextInt();
int prime;
if(n==2){
prime=1;
}
else if(n>2){
prime=1;
for(int i=3;i<=n;i++){
if(prime(i)){
prime++;
}
}
}
else{prime=0;}
System.out.println(prime);
}
}
public static boolean prime(int x){
for(int i=2;i<x;i++){
int amari=x%i;
if(amari==0){
return false;
}
}
return true;
}
}
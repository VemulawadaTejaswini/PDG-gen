import java.util.Scanner;

public class Main {

static boolean pd(int num){
if(num==1)return false;
if(num==2||num==3) return true;
if(num%6!=1&&num%6!=5) return false;
 int tmp=(int) Math.sqrt(num); 
for(int i=5;i<tmp;i+=6)
	if(num%i==0||num%(i+2)==0)
  return false;
return true;}
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n=in.nextInt();
for(int i = 0;i<n;i++){
int a,b,ans=0;
a=in.nextInt();
b=in.nextInt();
if(a%2==0){
	for(int j=a+1;j<=b;j+=2){
		if(pd(j)&&pd((j+1)/2)){
			ans++;
		}	
		}
}
else{
for(int j=a;j<=b;j+=2){
if(pd(j)&&pd((j+1)/2)){
	ans++;
}	
}}
System.out.println(ans);
ans=0;
}
}
}

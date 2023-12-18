import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int ans=0;
int n=sc.nextInt();
int a=sc.nextInt();
int b=sc.nextInt();
for(int i=1;i<=n;i++){
int sum=0,temp=i;
    while(temp!=0){
sum+=temp%10;
temp/=10;
}
if(sum>=a&&sum<=b){ans+=i;}
}
System.out.println(ans);
}}
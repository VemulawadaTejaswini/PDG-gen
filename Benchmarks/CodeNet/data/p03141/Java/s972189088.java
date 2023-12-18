import java.util.Scanner;
class Main{
public static void main(String[] args ){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] sub=new int[n];
for(int i=0;i<n;i++){
int i1=s.nextInt();
int i2=s.nextInt();
sub[i]=i1>i2?i1-i2:i2-i1;
}
boolean flg=true;
while(flg){
flg=false;
for(int i=0;i<n-1;i++){
if(sub[i]<sub[i+1]){
int tmp=sub[i+1];
sub[i+1]=sub[i];
sub[i]=tmp;
flg=true;
}
}
}
int sum1=0;
int sum2=0;
for(int i=0;i<n;i++){
if(i%2==0){
sum1+=sub[i];
}else{
sum2=sub[i];
}
}
System.out.println(sum1-sum2);
} 
}
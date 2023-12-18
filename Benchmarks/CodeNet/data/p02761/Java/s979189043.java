import java.util.*;

class Main{
public static void main(String[] args ){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int M=sc.nextInt();
int[] num=new int[3];

for(int i=0;i<3;i++){
num[i]=-1;
}

for(int j=0;j<M;j++){
 int k=sc.nextInt();
 int l=sc.nextInt();
  if(l==0&&k==1){
System.out.print(-1);
return;
  }
if(num[k-1]!=-1&&num[k-1]!=l){
System.out.print(-1);
return;
}
num[k-1]=l;
}

for(int j=2;j>=0;j--){
if(num[j]==-1) num[j]=0;
}

int Ans=num[0]*100+num[1]*10+num[2];
System.out.print(Ans);
}
}

import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=sc.nextInt();
int[] vec=new int[N+1];
String S=sc.next();
int WL=0,ER=0,WR=0,EL=0;
for(int s=0;s<N;s++){EL=0;WL=0;ER=0;WR=0;
for(int t=0;t<s;t++){char P=S.charAt(t);
    if(P=='E'){
    EL+=1;
}
if(P=='W'){
    WL+=1;
}
}
for(int r=(s+1);r<N;r++){char Q=S.charAt(r);
  if(Q=='E'){
    ER+=1;
}
if(Q=='W'){
    WR+=1;
}
    }
vec[s]=Math.min((WL+ER),(WR+EL));
}
int Min=N;
for(int i=0;i<N;i++){
Min=Math.min(Min,vec[i]);
}
System.out.println(Min);
}
}

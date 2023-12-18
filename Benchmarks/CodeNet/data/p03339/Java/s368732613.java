import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=sc.nextInt();
int[] vec=new int[N+1];
String S=sc.next();
int WL=0,ER=0,WR=0,EL=0;
for(int s=0;s<N;s++){EL=0;WL=0;ER=0;WR=0;
for(int t=0;t<s;t++){String P=String.valueOf(S.charAt(t));
    if(P.equals("E")){
    EL+=1;
}
if(P.equals("W")){
    WL+=1;
}
}
for(int r=(s+1);r<N;r++){String Q=String.valueOf(S.charAt(r));
  if(Q.equals("E")){
    ER+=1;
}
if(Q.equals("W")){
    WR+=1;
}



    }
vec[s]=Math.min((WL+ER),(WR+EL));
}
for(int q=0;q<N;q++){
        for(int a=0;a<N-q;a++){
         
            if(vec[a]<vec[a+1]){
            int temp=vec[a];
            vec[a]=vec[a+1];
            vec[a+1]=temp;
            }
            
}
}
System.out.println(vec[N-1]);
}
}
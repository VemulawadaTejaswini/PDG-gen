import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N=Integer.parseInt(sc.next());
int K=Integer.parseInt(sc.next());
int count=0;
int[] A=new int[N];
for(int i=0;i<N;i++){A[i]=sc.nextInt();}
if(N==K){System.out.println("1");}else{
for(int i=0;i<N;i++){
if(A[i]==1){count=i+1;
System.out.println((count-1+(K-2))/(K-1)+(N-count+(K-2))/(K-1));
break;
}
}
}
}
}
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int M=sc.nextInt();
    int m[] =new int[M+1];
    m[0]=0;
    for(int i=1;i<M+1;i++){
      m[i]=m[i-1]+sc.nextInt();}
    if(N>=m[M]){System.out.println(N-m[M]);}
    else{System.out.println(-1);}
  }
}
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    String M[] =new String[N];
    for(int i=0;i<N;i++){
      M[i]=sc.next();}
    Arrays.sort(M);
    int x =1;
    for(int j=1;j<N;j++){
      if(M[j].equals(M[j-1])){continue;}
      else{x=x+1;}}
    System.out.println(x);
  }
}
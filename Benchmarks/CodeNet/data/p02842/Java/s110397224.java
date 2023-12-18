import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N=sc.nextInt();int x=0;
    for(int i=0;i<N;i++){
      if((i*27>=25*N)&&(i*27<25*N+25)){System.out.println(i);System.exit(0);}
      else{x=x+1;}}
    if(x==N){System.out.println(":(");}
  }
}
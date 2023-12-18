import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int N[] =new int[n];
    int x=0;
    for(int i=0;i<n;i++){
      N[i]=sc.nextInt();}
    for(int j=1;j<n-1;j++){
      if((N[j-1]<N[j])&&(N[j]<N[j+1])){x=x+1;}
      else if((N[j-1]>N[j])&&(N[j]>N[j+1])){x=x+1;}}
    System.out.println(x);
  }
}
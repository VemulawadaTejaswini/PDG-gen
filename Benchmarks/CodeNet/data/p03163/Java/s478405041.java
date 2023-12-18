import java.util.*;
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int wei=sc.nextInt();
  int w[]=new int[n];
  int v[]=new int[n];
  for(int i=0;i<n;i++){
  w[i]=sc.nextInt();
    v[i]=sc.nextInt();
  }
  int sto[][]=new int[n+1][wei+1];
  
  
  for(int i=1;i<=n;i++){
  for(int j=0;j<=wei;j++){
      
      if(i==0 || j==0)
      sto[i][j]=0;
  if(w[i-1]<=j){
  sto[i][j]=Math.max(sto[i-1][j],v[i-1]+sto[i-1][j-w[i-1]]);
  }
    else{
    sto[i][j]=sto[i-1][j];
    }
  }
  }
  
  System.out.println(sto[n][wei]);
}
}
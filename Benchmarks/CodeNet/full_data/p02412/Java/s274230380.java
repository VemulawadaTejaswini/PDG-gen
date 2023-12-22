import java.util.Scanner;
class Main{
 public static void main(String[] args){
  int i,j,k,n,x,g,p;
  while(true){
   p=0
   Scanner sc = new Scanner(System.in);
   n=sc.nextInt();
   x=sc.nextInt();
   if(n==0 && x==0)
    break;
   for(i=1;i<=n;i++){
    for(j=2;j<=n;j++){
     if(i==j)
      break;
     for(k=3;k<=n;k++){
      if(i==k || j==k)
       break
      g=i+j+k;
      if(x==g)
       p++;}}}
    System.out.println(p);}
 }
}

   

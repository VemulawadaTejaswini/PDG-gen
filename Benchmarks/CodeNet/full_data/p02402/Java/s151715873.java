import java.util.Scanner;
class Main{
 public static void main(String args[]){
  long max,min,n,g,i,j;
  max=-1000001;min=1000001;g=0;i=0;
  Scanner sc = new Scanner(System.in);
  n=sc.nectInt();
  while(i<n){
   j=sc.nextInt();
   if(max<j)
    max=j;
   if(min>j)
    min=j;
   g+=j;
   i++;}
  System.out.println(min+" "+max+" "+g);
 }
}

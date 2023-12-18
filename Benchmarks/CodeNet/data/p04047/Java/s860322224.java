import java.util.*;
 
class Main{
 void main(String[]args){
 
  Scanner sc=new Scanner(System.in);
  
  int n =sc.nextInt();
  int[] l=new int[n*2];  
  
  for(int i=0; i<l.length; i++){
   l[i]=sc.nextInt();
}
  Arrays.sort(l);
  
  int ans=0;
  for(int i=0; i<l.length-1; i+=2){
    ans +=Math.min(l[i],l[i+1]);
}
System.out.println(ans);


}}
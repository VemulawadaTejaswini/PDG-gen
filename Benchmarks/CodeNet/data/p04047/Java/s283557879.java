import java.util.*;
 
class Main{
 void main(String[]args){
 
  Scanner sc=new Scanner(System.in);
  
  int nagasa =sc.nextInt();
  int l[]=new int[nagasa];  
  
  for (int =0; i<length; i++){
   l[i]=sc.nextInt();
}
  Arrays.sort(l);

  for(int i=0; i<length-1; i++){
    int ans=0;
    ans +=<Math.min(l[i],l[i+1]);
    System.out.println(ans);
}



}}
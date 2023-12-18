 import java.util.*;

public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
   int N=sc.nextInt();
   int M=sc.nextInt();
   int[] problem=new int[M];
   int[] result=new int[M];
   int[] correct=new int[N+1];
   int answer=0;
   int miss=0;
   
   for(int i=0;i<M;i++){
     problem[i]=sc.nextInt();
     if((sc.next()).equals("AC")){
       result[i]=0;
     }else{
       result[i]=1;
     }
   }
   
   for(int j=0;j<N+1;j++){
     correct[j]=1;
   }
   
   for(int k=0;k<M;k++){
     if(correct[problem[k]]==1&&result[k]==1){
       miss++;
     }
     else if(correct[problem[k]]==1&&result[k]==0){
       correct[problem[k]]=0;
       answer++;
     }
   }
   
   System.out.println(answer+" "+miss);
 }
}

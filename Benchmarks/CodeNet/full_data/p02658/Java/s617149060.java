import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    long[] List=new long[N];
    for(int i=0;i<N;i++) List[i]=s.nextLong();
    Arrays.sort(List);
    long ans=1;
    long comp=(long)Math.pow(10,18);
    
    try{
      for(int i=0;i<N;i++){
        ans*=List[i];
      	if(ans>comp||ans<=0) throw new Exception();
      }
    }catch(Exception e){
    System.out.println(-1);  
  }
  
  if(ans<=comp) System.out.println(ans);
  }  
}
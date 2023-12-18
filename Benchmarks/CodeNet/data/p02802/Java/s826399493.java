import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] b=new int[n];
    int ac=0;
    int wa=0;
    for(int i=0;i<m;i++){
      int mon=sc.nextInt()-1;
      String st=sc.next();
      if(b[mon]==-1){
        
      }else if(st.equals("AC")){
        ac++;
        wa+=b[mon];
        b[mon]=-1;
      }else if(st.equals("WA")){
        b[mon]++;
      }
    }
    System.out.println(ac+" "+wa);
  }
}
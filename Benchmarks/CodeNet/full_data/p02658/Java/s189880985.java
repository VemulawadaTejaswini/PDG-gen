import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner st = new Scanner(System.in);
    long sum=1L;
    int num= st.nextInt();
    for(int i=0;i<num;i++){
      sum *= st.nextLong();
      if(sum > 1000000000000000000) {
        sum=-1;
        break;
      }
    }
    System.out.println(sum);
  }
}
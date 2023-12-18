import java.util.*;
 
public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    long D = sc.nextLong();
    long Num=B-A+1;
    long count1=(B/C)-((A-1)/C);
    long count2=(B/D)-((A-1)/D);
    long count3=0;
    long Result=0;
    long numC=0;
    int i=0;
    int j=0;
    long numD=D+(D*j);
    while(numC<B/2){
              numC=C+(C*i);
      			
      			
      		 if (numC==numD){
              break;
           }else if(numC>numD){
                j++;
                numD=D+(D*j); 
           }
      	i++;
    }
	count3=(B/numD)-((A-1)/numD);
    Result=count1+count2-count3;
          
    System.out.println(Num-Result);
  }
}
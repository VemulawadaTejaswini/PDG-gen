import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner i = new Scanner(System.in);
      int A = i.nextInt();
      int B = i.nextInt();
      int C = i.nextInt();
      int D = i.nextInt();
      boolean ta = false;
      for(int j=1;true;j++){
      	C-=B;
        if(C<=0){ta=true;break;}
        A-=D;
        if(A<=0){ta=false;break;}
      }
      System.out.println(ta?"Yes":"No");
    }
}
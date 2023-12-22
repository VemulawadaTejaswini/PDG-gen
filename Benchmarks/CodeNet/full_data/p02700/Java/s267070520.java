import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner i = new Scanner(System.in);
      int A = i.nextInt();
      int B = i.nextInt();
      int C = i.nextInt();
      int D = i.nextInt();
      boolean ta = false;
      for(int j=1;A<0||C<0;j++){
      	C-=B;
        ta=C<=0?true:false;
        A-=D;
        ta=A<=0?false:true;
      }
      System.out.println(ta?"Yes":"No");
    }
}
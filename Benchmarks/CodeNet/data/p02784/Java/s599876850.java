import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int H=sc.nextInt();
      int N=sc.nextInt();
      int[] A=new int[N];
      for(int i=0;i<N;i++){
         A[i]=sc.nextInt();
         H-=A[i];
      }
      if(H<=0){
         System.out.print("Yes");
      }else{
         System.out.print("No");
      }
   }
}
         

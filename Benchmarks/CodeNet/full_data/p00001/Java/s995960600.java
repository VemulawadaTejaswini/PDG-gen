import java.util.*;
public class aoj0001 {
   public static void main(String[] args){
	   Scanner buf = new Scanner(System.in);
	   int[] a = new int[10];
	   for(int i=0;i<10;i++) a[i] = buf.nextInt();
	   Arrays.sort(a);
	   System.out.println(a[9]);
	   System.out.println(a[8]);
	   System.out.println(a[7]);
   }
}
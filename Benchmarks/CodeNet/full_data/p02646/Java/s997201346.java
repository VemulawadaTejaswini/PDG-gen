import java.util.*;
 
public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		long Azahyou = sc.nextLong();
      	long Amove = sc.nextLong();
      	long Bzahyou = sc.nextLong();
      	long Bmove = sc.nextLong();
      	long time = sc.nextLong();
      
      	long A = 0;
      	long B = 0;
      	A = Azahyou + (Amove * time);
      	B = Bzahyou + (Bmove * time);
      
      	if (A>=B){
          System.out.print("YES");
        }else{
          System.out.print("NO");
        }
		
	}
}
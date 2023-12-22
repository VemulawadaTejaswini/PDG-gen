import java.util.*;
 
public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		long Azahyou = sc.nextLong();
      	long Amove = sc.nextLong();
      	long Bzahyou = sc.nextLong();
      	long Bmove = sc.nextLong();
      	long time = sc.nextLong();
      
      	
      	for (int i=1; i<=time; i++){
          	long A = 0;
      		long B = 0;
      		A = Azahyou + (Amove * i);
      		B = Bzahyou + (Bmove * i);
            if (A==B){
          		System.out.print("YES");
              	return;
        	}
        }
      
        System.out.print("NO");

		
	}
}
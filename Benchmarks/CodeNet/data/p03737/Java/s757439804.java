import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        String s1 = sc.next().toUpperCase();
        String s2 = sc.next().toUpperCase();
        String s3 = sc.next().toUpperCase();
        String[] s = {s1,s2,s3};
      
        for(int i = 0; i < 3; i++){
          System.out.print(s[i].charAt(0));
        }
      
        System.out.println();
	}

}
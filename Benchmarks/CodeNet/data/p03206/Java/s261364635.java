import java.util.*;
public class Main {
	public static void main(String[] args){
     	String chri = "Christmas";	
      	String chriE = "Christmas Eve";
        String chriEE = "Christmas Eve Eve";
      	String chriEEE = "Christmas Eve Eve Eve";
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		if(d == 25){
          	System.out.println(chri);
        }else if(d == 24){
          	System.out.println(chriE);
        }else if(d == 23){
        	System.out.println(chriEE);
        }else{
        	System.out.println(chriEEE);
        }
	}
}

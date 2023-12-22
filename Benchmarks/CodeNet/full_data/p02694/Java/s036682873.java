import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	long x = sc.nextLong();
      	long have = 100;
      	int count = 0;
      	while(have < x){
        	have += have/100;
          	count++;
        }
      	System.out.println(count);
    }
}
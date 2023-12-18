import java.util.*;
class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	int l = sc.nextInt();
        System.out.println(String.format("%.12f",(double)(l * l * l)/27));
    }
}
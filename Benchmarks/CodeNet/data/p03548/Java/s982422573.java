import java.util.*;

public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
      int ans=(x-2*z)/(y+z);
      if((x-2)%(y+z)==y){
      	ans+=1;
      }
      System.out.println(ans);
    }
}
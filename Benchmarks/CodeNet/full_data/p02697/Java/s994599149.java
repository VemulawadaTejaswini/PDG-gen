import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long n=sc.nextLong(),m=sc.nextLong(),x,y;
  	if(n%2==0){
  		x=n/2;
  		y=n/2+1;
  		for(int i=1;i<=m;i++){
  			System.out.println(x + " " + y);
  			x--;
  			y++;
  		}
  	}else{
  		x=1;
  		y=n-1;
  		for(int i=0;i<m;i++){
  			System.out.println(x + " " + y);
  			x++;
  			y--;
  		}
  	}
  }
}
import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	while(true){
  		int m = sc.nextInt(), f = sc.nextInt(), r = sc.nextInt();
  		if( m==-1 && f==-1 && r==-1 ) break;
  		final String ANS = "ABCDF";
  		int ans = 0;
  		if(m==-1 || f==-1) ans = 4;
  		else if(m+f>=80) ans = 0;
  		else if(m+f>=65) ans = 1;
  		else if(m+f>=50) ans = 2;
  		else if(m+f>=30){
  			if(r>=50) ans = 2;
  			else ans = 3;
  		}else ans = 4;
  		System.out.printf("%c\n",ANS.charAt(ans));
  	}
  }
}
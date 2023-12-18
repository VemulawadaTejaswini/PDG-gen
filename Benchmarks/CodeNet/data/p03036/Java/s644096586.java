import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
		int r = sc.nextInt();
		int d = sc.nextInt();
        int ans = sc.nextInt();
	  for(int i=0;i<10;i++){ans=ans*r-d;System.out.println(ans);}
  }
}
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int d = scn.nextInt();
		int n = scn.nextInt();
      	int ans = 0;
      	if(d==0){
          ans = n;
        }else{
          int dd = 1;
          for(int i=0; i<d; ++i){
            dd = dd*100;
          }
          ans = dd*n;
        }
      	System.out.println(ans);
	}
}
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
      	int n = scn.nextInt();
      	int ans = 1;
      	for(int i = 0; i<n; i++){
          ans = ans*scn.nextInt();
          if(ans >= 10^8){
            System.out.println("-1");
            return;
          }
        }
      System.out.println(ans);
	}
}


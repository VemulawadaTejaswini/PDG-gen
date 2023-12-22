import java.util.*;
 
class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
      	int n = scn.nextInt();
      	Long ans = new Long(1);
      	for(int i = 0; i<n; i++){
          ans = ans*scn.nextLong();
        }
        if(ans.compareTo((long)Math.pow(10,18)) == 1){
            System.out.println("-1");
            return;
        }
      System.out.println(ans);
	}
}
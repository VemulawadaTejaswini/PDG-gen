import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		int num = sc.nextInt(); 
      	long long nums[] = new long long[num];
      	long long ans = 1;
      	boolean con = true;
      
      	for(int i = 0;i < num && con; i++) {
          ans *= sc.nextLong();
          if(Mash.log(ans) <= 18) con = false;
        }
      	
      	if(con) System.out.println(ans);
      	else System.out.println(-1);
        
	}
}

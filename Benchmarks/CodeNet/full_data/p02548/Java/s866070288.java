import java.util.*;

public class Main{ //クラス名はMain
    public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			long n = Long.parseLong(sc.next());
			
			/*--------------------------------*/
			//入力
			//int n = 5;
			long ans = 0;
			long c = 0;
			for(long a =1;a<n;a++){
				for(long b = a;a*b<n;b++){
                  ans++;
				  if(a==b){
                    c++;
                  }
				}
			}

			System.out.println((ans*2)-c);
    }
}


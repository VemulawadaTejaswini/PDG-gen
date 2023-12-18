import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int k = sc.nextInt();
        double p = 0;
        int c = 0;
        for(int i=1; i<=n; i++){
          if(i >= k) p +~ 1/n;
          else {            
            for(int j=1; j<100000; j++){
              if(i+2^j >= k) {
                c = j;
                break;
              }
            }
            p += 1/n * (1/2)^c;
        }
        System.out.println(p);
    }
}

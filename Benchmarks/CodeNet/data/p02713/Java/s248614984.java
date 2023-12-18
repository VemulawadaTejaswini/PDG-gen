import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int K = sc.nextInt();
        long sum = (long) 0;
      	for(int i=1; i<K+1;  i++){
          for(int j=1; j<K+1;  j++){
            for(int l=1; l<K+1;  l++){
              sum += gcd(gcd(i,j),l);
            }
          }
        }
      
      	System.out.println(sum);
        return;
	}
       static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}
}

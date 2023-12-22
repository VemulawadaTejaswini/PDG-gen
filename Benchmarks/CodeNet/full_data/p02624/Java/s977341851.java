import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	long ans = 0;
      	int count = 0;
      	for(int i=1;i<n+1;i++){
          count = 0;
          for(int j=1;j<i+1;j++){
            if( i % j == 0 ){
              count++;
            }
            if( j*j > i && j != i){
              j = i - 1;
            }
          }
          ans += count * i;
        }
      System.out.println(ans);
    }
}
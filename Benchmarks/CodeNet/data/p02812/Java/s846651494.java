import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	String str = sc.next();
      	Integer cnt = 0;
      	Integer flag = 0;
		for(int i=0; i < N; i++){
          if(str.charAt(i)=='A'){
          	if((i+1!=N)&&(str.charAt(i+1)=='B')){
              if((i+2!=N)&&(str.charAt(i+2)=='C')){
                cnt++;
              }
          	}
          }
        }
		System.out.println(cnt);
      	return;
	}
}

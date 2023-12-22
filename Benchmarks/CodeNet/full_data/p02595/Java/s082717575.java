import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int cnt = 0;
      	int dd = d*d;
      	for(int i=0; i<n; i++){
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	if(Math.sqrt(a*a + b*b) <= d){
          		cnt++;
        	}
      	}
		System.out.println(cnt);
	}
}

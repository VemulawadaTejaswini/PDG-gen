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
        	if((a*a + b*b) <= dd){
          		cnt++;
        	}
      	}
		System.out.println(cnt);
	}
}
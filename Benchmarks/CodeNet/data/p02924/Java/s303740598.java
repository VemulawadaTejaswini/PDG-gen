import java.util.*;

public static void Main(){
	Scanner sc = new Scanner(System.in);
  	int n = sc.nextInt();
  	long ans = 0;
  	for(int i = 1 ; i < n ; i++){
      ans += i;
    }
  	System.out.println(ans);
}
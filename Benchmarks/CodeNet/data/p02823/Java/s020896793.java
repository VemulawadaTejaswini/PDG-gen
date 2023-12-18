import java.util.*;

public class Main{
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int n=sc.nextInt();
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	if((b-a)%2==1 && (a>n/2)){
		System.out.println(n-a);
	}else if((b-a)%2==1 && (a<n/2)){
		System.out.println(b-1);
	}else if((b-a)%2==1 && a==(n-1)/2+1){
		System.out.println(a-1);
	}else{
		System.out.println((b-a)/2);
	}
}
}

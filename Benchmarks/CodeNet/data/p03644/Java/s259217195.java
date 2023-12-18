import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int ni = 2;
	int max = 0;
	if(N == 1){
		System.out.println(1);
		System.exit(1);
	}
	if(N >= 64){
		System.out.println(64);
		System.exit(1);
	}
	while(true){
		if(ni <= N){
			max = ni;
		}else{
			System.out.println(max);
			break;
		}
		ni *= 2;
	}
	}
}	
	


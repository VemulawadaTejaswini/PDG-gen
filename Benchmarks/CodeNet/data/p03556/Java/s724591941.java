import java.util.*;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long N = sc.nextInt();
	for(long i = N;i >1;i--)
	{
		if(i*i <= N){
			System.out.println(i*i);
			break;
		}
	}
	}

}

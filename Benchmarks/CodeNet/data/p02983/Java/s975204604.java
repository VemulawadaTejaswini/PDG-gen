import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt() % 2019;
		int R = sc.nextInt() % 2019 + 2019;
		int min = L*R%2019;
		for(int i=L;i<R;i++){
		    for(int j=i+1;j<=R;j++){
		        if(i*j%2019 < min){
		            min = i*j%2019;
		        }
		    }
		}
		System.out.println(min);
	}
}
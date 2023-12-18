import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		int min = L*R%2019;
		if(R-L>2019){
		    System.out.println(0);
		    return;
		}
		for(int i=L;i<R-1;i++){
		    for(int j=i+1;j<R;j++){
		        if(i*j%2019 < min){
		            min = i*j%2019;
		        }
		    }
		}
		System.out.println(min);
	}
}
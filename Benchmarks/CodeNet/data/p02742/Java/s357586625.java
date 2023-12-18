import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int H = sc.nextInt();		
		int W = sc.nextInt();
		int count =0;

		for(int i=1; i<=H; i++){
			if(i%2==0||W%2==0){
			count +=W/2;
			}else{
				count +=W/2+1;
			} 
		}
		
		System.out.println(count);
	}	
}

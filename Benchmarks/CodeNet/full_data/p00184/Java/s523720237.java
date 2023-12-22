import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			
			int[] a = new int[7];
			int m=0;
			for(int i=0;i<n;i++){
				m = sc.nextInt();
				if(m<10){
					a[0]++;
				}else if(m>=10 && m<20){
					a[1]++;
				}else if(m>=20 && m<30){
					a[2]++;
				}else if(m>=30 && m<40){
					a[3]++;
				}else if(m>=40 && m<50){
					a[4]++;
				}else if(m>=50 && m<60){
					a[5]++;
				}else if(m>=60){
					a[6]++;
				}	
			}

			for(int i=0;i<7;i++){
				System.out.println(a[i]);
			}
		}
	}	
}
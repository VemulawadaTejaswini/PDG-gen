import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int sum = 0;
			int keep = 0;
			int[] d = new int[6];
			d[0] = 1;
			d[1] = 6;
			d[2] = 2;
			d[3] = 3;
			d[4] = 5;
			d[5] = 4;
			
			for(int i=0;i<n;i++){
				String s = sc.next();
				if(s.compareTo("North")==0 || s.compareTo("South")==0){
					for(int j=0;j<3;j++){
						keep = d[0];
						d[0] = d[2];
						d[2] = d[1];
						d[1] = d[4];
						d[4] = keep;
						if(s.compareTo("North")==0)break;
					}
				}else if(s.compareTo("East")==0 || s.compareTo("West")==0){
					for(int j=0;j<3;j++){
						keep = d[0];
						d[0] = d[5];
						d[5] = d[1];
						d[1] = d[3];
						d[3] = keep;
						if(s.compareTo("East")==0)break;
					}
				}else if(s.compareTo("Right")==0 || s.compareTo("Left")==0){
					for(int j=0;j<3;j++){
						keep = d[2];
						d[2] = d[3];
						d[3] = d[4];
						d[4] = d[5];
						d[5] = keep;
						if(s.compareTo("Right")==0)break;
					}
				}
				sum += d[0];
			}
			System.out.println(sum+1);
		}
	}
}
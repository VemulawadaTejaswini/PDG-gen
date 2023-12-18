import java.math.*;
import java.util.*;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int Aup;
			int Abottom;
			int Bup;
			int Bbottom;
			int count = 0;
			
			
			for(int i=1;i<=n;i++) {
				Abottom = i%10;
				int APow = (int) Math.pow(10,(String.valueOf(i).length()-1));
				Aup =i/APow;
				
				for(int j=1;j<=n;j++) {
					Bbottom = j%10;
					int BPow = (int) Math.pow(10,(String.valueOf(j).length()-1));
					Bup =j/BPow;
					
					if(Abottom==Bup && Bbottom==Aup) {
						count++;
					}
					
				}
				
				
			}
			
			System.out.println(count);
			
		}

	}
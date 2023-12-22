import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		
		int n = scan.nextInt();
		boolean[] flag = new boolean[64];
		
		for(int i=0; i<n; i++) {
			
			int query = scan.nextInt();
			
			switch(query) {
			
			case 0:	//test
				int cmd0 = scan.nextInt();
				System.out.println(flag[cmd0] ? 1 : 0);
				break;
				
			case 1: //set
				int cmd1 = scan.nextInt();
				flag[cmd1] = true;
				break;
				
			case 2: //clear
				int cmd2 = scan.nextInt();
				flag[cmd2] = false;
				break;
				
			case 3: //flip
				int cmd3 = scan.nextInt();
				if(flag[cmd3]) {flag[cmd3] = false; 
				}else { flag[cmd3] = true;	//WARNING
				}
				break;
				
			case 4: //all
				int count = 0;
				for(int j=0; j<64; j++) {
					if(flag[j]) count++;
				}
				if(count == 64)	System.out.println(1);
				else System.out.println(0);		
				break;
				
			case 5: //any
				int count2 = 0;
				for(int j=0; j<64; j++) {
					if(flag[j]) count2++;
				}
				if(count2 > 0)	System.out.println(1);
				else System.out.println(0);
				break;
				
			case 6:	//none
				int count3 = 0;
				for(int j=0; j<64; j++) {
					if(flag[j]) count3++;
				}
				if(count3 == 0)	System.out.println(1);
				else System.out.println(0);
				break;
				
			case 7:	//count
				int sum = 0;
				for(int j=0; j<64; j++) {
					if(flag[j]) sum++;
				}
				System.out.println(sum);	
				break;
				
			case 8:	//var
				long sum2 = 0;
				for(int j=0; j<64; j++) {
					long pow = 1;

					if(flag[j]) {
						for(int k=0; k<j; k++) pow *= 2;
						sum2 += pow;
					}
				}
				System.out.println(Long.toUnsignedString(sum2));	
				break;
			}
		}
	}
}

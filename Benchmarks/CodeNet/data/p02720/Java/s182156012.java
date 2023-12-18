import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int K = scan.nextInt();
			
			int ok=0;
			int count = 1;
			int lunluncount  = 0;
			int lunlun=0;
			
			do {
				String S = String.valueOf(count);
				if(S.length()==1) {
					lunluncount++;
					lunlun = count;
				
					//System.out.println(count);
					count++;
				}else{
					char[] c = new char[S.length()];
					c = S.toCharArray();
					boolean lun = true;
					for(int i = 0;i<S.length()-1;i++) {
						if(Math.abs(('0'+c[i])-('0'+c[i+1]))>1) {
							lun = false;
							break;
						}
					}
					
					if(lun) {
						lunluncount++;
						lunlun = count;
						//System.out.println(count);
					}
					
					
					
					
					count++;
				}
				
				
				if(lunluncount==K) {
					ok=1;
				}
				
				
				
			}while(ok==0);
			
			System.out.println(lunlun);
			
		}	
	}
}

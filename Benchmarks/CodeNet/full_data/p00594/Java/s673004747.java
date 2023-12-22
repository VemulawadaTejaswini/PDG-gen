import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		try {
			int A_size;
			while(true){
				/* input from here */
				A_size = scan.nextInt();
				String[] A = new String[A_size];
				if(A_size==0){
					break;
				} else if(A_size==1){
					System.out.println(scan.next());
					continue;
				} else {
					for(int i=0;i<A_size;i++){
						A[i] = scan.next();
					}
				}
				/* input till here */
				/* processing from here */
				Arrays.sort(A);
				/*
				for(String a: A){
					System.out.print(a + " ");
				}
				*/
				/* processing till here */
				/* output */
				
				boolean nosol = true;
				int count = 1;
				for(int i=0;i<A_size-1;i++){
					if(A[i].equals(A[i+1])){
						count++;
						if(count>A_size/2){
							System.out.println(A[i]);
							nosol = false;
							break;
						}
					} else {
						count = 1;
						if(i>A_size/2){
							break;
						}
					}					
				}
				if(nosol){
					System.out.println("NO COLOR");
				}		
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scan.close();
		}
	}
}
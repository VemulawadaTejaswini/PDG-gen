import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			
			int[] L = new int[N];
			
			
			int trycnt = 0;
			int firstLine = 0;
			int secondLine =0;
			int thirdLine =0;
			for(int i=0;i<N;i++) {
				L[i]=sc.nextInt();
			}
			
			
			
			Arrays.sort(L);
			

			for(int j=0;j<N-2;j++) {
		//		 System.out.println("start jroop"+j);
				 firstLine = L[j];
				
				for(int k=j+1;k<N-1;k++) {
					
					secondLine = L[k];
					if(firstLine==secondLine) {
//						System.out.println(j+":"+k+":"+L[j]);
					}else {
					
						for(int m=k+1;m<N;m++) {
							thirdLine = L[m];
							if(thirdLine==secondLine||thirdLine==firstLine) {
	
							}else{
				//				System.out.println("("+firstLine+","+secondLine+","+thirdLine+")");
								if(firstLine+secondLine>thirdLine) {
									trycnt=trycnt + 1;
				//					System.out.println("OK");
									
								}else {
				//					System.out.println("NG");
								}
							}
						}
					}
				}
				
			}
			
			
			
			System.out.println(trycnt);
	}	
}
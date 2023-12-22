import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		while(stdIn.hasNext()){
			n = stdIn.nextInt();					
		
			int count = 0;
		
			for(int i=0; i<=9; i++){
				for(int j=0; j<=9; j++){
					for(int k=0; k<=9; k++){
						for(int l=0; l<=9; l++){
							
							if(i+j+k+l==n)
								count ++;

						}
					}				
				}			
			}
		
			System.out.println(count);

		}

		

	}

}
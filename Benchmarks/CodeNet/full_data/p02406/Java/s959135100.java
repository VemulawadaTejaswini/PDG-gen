import java.util.*; 

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		
		int n=cin.nextInt();
		int i=1;
		while(i<=n){
			int x=i;
			
			if(x%3==0){
				System.out.print(" "+i);
			}
			
			else if(x%10==3){
				System.out.print(" "+i);
			}
			else if((x/=10)>=1 && x%10==3){
				System.out.print(" "+i);
			}
			i++;
		}
		System.out.println();

	}

}


import java.util.Scanner; 

class Main{

	public static void main(String[] args){
		while(true){
			Scanner scan = new Scanner(System.in);

			int n = scan.nextInt();
			int k = scan.nextInt();

			if(n==0&&k==0){
				break;
			}

			int[] s = new int[k];
			boolean flag=true;

			for(int i=0;i<k;i++){
				s[i]=scan.nextInt();
			}

			int[] adder = new int[k];

			for(int j=0;j<n;j++){
				for(int i=0;i<k;i++){
					adder[i]+=scan.nextInt();
				}
			}

			for(int i=0;i<k;i++){
				if(adder[i]>s[i]){
					flag=false;
				}
			}	
		
			if(flag){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
	
	}

}
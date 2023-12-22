
public class Main {	
	public static void main(String[]args){
		Scanner scan =new Scanner(System.in);
			int a =scan.nextInt();
			int b =scan.nextInt();
			int c =scan.nextInt();
			int i=0; 
			
			while(a<=b){
				if(c%a==0){
					i++;
					a++;
			}
			}
			System.out.println(i);				
			}
	}
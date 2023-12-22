import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n,i;
		
		while(true){
			n = sc.nextInt();
			if(n == 0)break;
			i = 0;
			
			for(i = 0; i < n + 1; i++){
				String str = String.valueOf(i);
				for(int j = 0; j < str.length(); j++)
					if(str.charAt(j) == '4' || str.charAt(j) == '6'){
						n++;
						break;
					}
			}
			System.out.println(n);
		}
		sc.close();
	}
}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String str = sc.next();
			int n = sc.nextInt();
			
			int count = 0;
			for(int i = 0; i < n; i++){
				char[] c_str = str.toCharArray();
				char[] input = sc.next().toCharArray();
				
				for(int j = 0; j < input.length; j++){
					boolean flag = true;
					for(int k = 0; k < c_str.length; k++){
						if(input[(j + k) % input.length] != c_str[k]){
							flag = false;
							break;
						}
					}
					
					if(flag){
						count++;
						break;
					}
				}
				
			}
			
			System.out.println(count);
		}
		
		
	}

}
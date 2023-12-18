import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int input_num = sc.nextInt();
		int num[] = new int[input_num];
		int even_count = 0;
		
		for(int i=0;i<input_num;i++){
			num[i] = sc.nextInt();
			if(num[i] % 2 == 0) even_count++;
		}
		
		int even_num[] = new int[even_count];
		int even_elements = 0;
		
		for(int i=0;i<input_num;i++){
			if(num[i] % 2 == 0){
				even_num[even_elements] = num[i];
				even_elements++;
			}
		}
		
		boolean judge = true;
		
		for(int i=0;i<even_elements;i++){
			if(even_num[i] % 3 != 0 && even_num[i] % 5 != 0){
				judge = false;
				break;
			}
		}
		
		if(judge){
			System.out.println("APPROVED");
		}else{
			System.out.println("DENIED");
		}
	}
}
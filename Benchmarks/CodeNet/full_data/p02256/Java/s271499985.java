import java.util.*;


public class Main{

	public static void main(String args[]){

		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int surplus = 0;
		int i = 0;


		while( i < 100000000){
			if(num1>=num2){
				surplus = num1%num2;
				num1 = num2;
				num2 = surplus;
				if(surplus == 0){
					System.out.println(num1);
					break;
				}else{
					i++;
				}

			}else if(num2>=num1){
				surplus = num2%num1;
				num1 = num2;
				num2 = surplus;
				if(surplus == 0){
					System.out.println(num2);
					break;
				}else{
					i++;
				}
			}
		}
	}
}

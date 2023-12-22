import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
 		while(true){
 			int numnum = sc.nextInt();
 			int goalsum = sc.nextInt();

 			if(numnum == 0 && goalsum == 0){break;}

	 		int answer = 0;
 			boolean[] check = new boolean[10]; 
 			for (int i = 0; i < 1024; i++) {
 				int count = 0;
 				int sum = 0;
 				int binary = i;
 				for (int j = 0; j < 10; j++) {
 					if(binary % 2 == 0){
 						check[j] = true;
 					}else{
 						check[j] = false;
 					}
 					binary /= 2;
 				}

 				for (int j = 0; j < 10; j++) {
 					if(check[j]){
 						count++;
 						sum += j;
 					}
 				}
 				if(count == numnum && sum == goalsum){
 					answer++;
 				}
 			}
	  		System.out.println(answer);
 		}
	}
}
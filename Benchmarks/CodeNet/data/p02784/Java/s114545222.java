import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();		
      	int N = sc.nextInt();
		int attack_sum = 0;
      	for(int i=0;i<N;i++){
        	attack_sum += sc.nextInt();
        }
      	if(attack_sum>=H){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
		
    }
}
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int kids[];
		kids = new int [N];
		
		int i = 0;
		int candy = 0;
		
		for(i = 0; i < N; i++){
			kids[i]= sc.nextInt();
		}
		
		Arrays.sort(kids);
		int num = N;
		i = 0;
		
		for(candy = X; candy >=0; candy++){
			candy = candy - kids[i];
			if(candy <0){
				break;
			}else{
				i++;
			}
			N = N -1;
			
			if (N == 0){
				i = num;
				break;
			}
		}
		
		
		
		
		
		System.out.println(i);
	}
}
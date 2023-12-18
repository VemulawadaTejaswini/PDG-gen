import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int robo = sc.nextInt();
		int[] plus = new int[robo];
		int[] minus = new int[robo];
		int x = 0;
		int l = 0;
		int count = robo;
		for (int i = 0; i < robo - 1; i++){
			x = sc.nextInt();
			l = sc.nextInt();
			plus[i] = x + l;
			minus[i] = x - l;
		}
		for (int i = 0; i < robo -1; i++){
        	if (plus[i] > minus[i + 1] && minus[i + 1] > minus[i]){
				count--;
              	plus[i] = 0;
                if (i != 0 && plus[i - 1] == 0){
                	count++;  
                }
			}
        }
      	System.out.println(count);
	}
}
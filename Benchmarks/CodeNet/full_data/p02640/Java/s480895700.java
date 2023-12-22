import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
      	int y = sc.nextInt();
      	int judge = 1;
      	int n = 0;
      	if(4 * x >= y && y % 2 == 0){
          	while(y > 0){
            	if(y / 2 + n != x){
                	y -= 4;
                  	n += 4;
                }else{
                	System.out.println("Yes");
                }
            }
          	System.out.println("No");
        }else{
        	System.out.println("No");
        }
	}
}
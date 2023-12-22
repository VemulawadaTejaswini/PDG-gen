import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int x = sc.nextInt();
      	int y = sc.nextInt();
      	int a,b;//a鶴2,b亀4
      	boolean isTrue = false;
      	for(a = 0; a <= x; a++){
        	b = x - a;
          	if(2*a + 4*b == y){
              isTrue = true;
              break;
            }
        }
      	if(isTrue) System.out.println("Yes");
      	else System.out.println("No");
    }
}

import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
      	int b = sc.nextInt();
      	int c = sc.nextInt();
      	boolean isTrue = false;
      	for(int i = a; i <= a*b; i+=a){
        	if(i%b == c){
              isTrue = true;
              break;
            }
        }
      	if(isTrue) System.out.println("YES");
      	else System.out.println("NO");
    }
}
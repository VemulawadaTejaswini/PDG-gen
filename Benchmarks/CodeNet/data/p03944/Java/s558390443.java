import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = sc.nextInt();
        int cx[] = {0, w};
        int cy[] = {0, h};
        for(int i = 0; i < n; i++){
        	int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            if(a == 1 && cx[0] < x){
            	cx[0] = x;
            }else if(a == 2 && cx[1] > x){
            	cx[1] = x;
            }else if(a == 3 && cy[0] < y){
            	cy[0] = y;
            }else if(a == 4 && cy[1] > y){
            	cy[1] = y;
            }
            if(cx[0] >= cx[1] || cy[0] >= cy[1]){
            	System.out.println(0);
                return;
            }
        }
        int yoko = cx[1] - cx[0];
        int tate = cy[1] - cy[0];
        System.out.println(yoko * tate);
	}
}
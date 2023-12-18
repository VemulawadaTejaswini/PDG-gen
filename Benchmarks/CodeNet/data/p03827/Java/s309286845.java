import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	char[] s = sc.next().toCharArray();
      	int x = 0;
      	int maxX = 0;
      	for(int i = 0; i < n; i++){
        	if(s[i] == 'I') x++;
          	else x--;
          	maxX = Math.max(maxX, x);
        }
      	System.out.println(maxX);
    }
}
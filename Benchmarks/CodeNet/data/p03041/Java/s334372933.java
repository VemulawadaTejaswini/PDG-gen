import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        int b = sc.nextInt();
        String[] s = sc.next().split();
        for(int i=0; i<num; i++){
          if(i == b) System.out.print(s[i].toLowerCase());
          else System.out.print(s[i]);
        }
	}
}
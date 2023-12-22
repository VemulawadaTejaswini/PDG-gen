import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int maxSize = sc.nextInt();
		int minute = sc.nextInt();
		int want = sc.nextInt();
        
        int answer = want/(maxSize*minute);
        if(answer==0){
          System.out.println(minute);
        } else {
         System.out.println(answer);
        }
	}
}
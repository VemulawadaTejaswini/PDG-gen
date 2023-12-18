import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
      	int n = scanner.nextInt();
        String name[] = new String[n];
		for(int t = 0;t<n;t++) {
			name[t] = scanner.next();
        }
        int x = 0;
		int amnt[] = {0,0,0,0,0};
        String moji[] = {"M","A","R","C","H"};
        int s;
        for(x = 0;x < n;x++){
          	for(s = 0;s<5;s++){
         		if(moji[s].equals(name[x].charAt(0)))amnt[s]++;
            }
        }
		Long ans = amnt[0]*(amnt[1]*(amnt[2]+amnt[3]+amnt[4])+amnt[2]*(amnt[3]+amnt[4])+amnt[3]*amnt[4])+amnt[1]*(amnt[2]*amnt[3]+amnt[2]*amnt[4]+amnt[3]*amnt[4])+amnt[2]*amnt[3]*amnt[4];
       System.out.println(ans);
    }
}
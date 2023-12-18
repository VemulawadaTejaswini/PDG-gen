
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String remark = scanner.next();
		
		for(int i = 0; i < 4; i++){
			String ans = "";
			if(i == 0){
				ans += "SS";
			}else if(i == 1){
				ans += "SW";
			}else if(i == 2){
				ans += "WS";
			}else if(i == 3){
				ans += "WW";
			}
			
			
			
			int j = 1;
			char c;
			char ind;
			while(j < remark.length() - 1){
				c = remark.charAt(j);
				ind = ans.charAt(j);
				if(ind == 'S'){
					if(c == 'o'){
						ans += ans.charAt(j - 1);
					} else {
						if(ans.charAt(j - 1) == 'S'){
							ans += "W";
						} else {
							ans += "S";
						}
					}
				} else {
					if(c == 'o'){
						if(ans.charAt(j - 1) == 'S'){
							ans += "W";
						} else {
							ans += "S";
						}
					} else {
						ans += ans.charAt(j - 1);
					}
				}
				
				j++;
			}
			
			c = remark.charAt(j);
			if(ans.charAt(j) == 'S'){
				if(c == 'o'){
					if(ans.charAt(0) == ans.charAt(j - 1)){
						System.out.println(ans);
						return;
					}
				} else {
					if(ans.charAt(0) != ans.charAt(j - 1)){
						System.out.println(ans);
						return;
					}
				}
			} else {
				if(c == 'o'){
					if(ans.charAt(0) != ans.charAt(j - 1)){
						System.out.println(ans);
						return;
					}
				} else {
					if(ans.charAt(0) == ans.charAt(j - 1)){
						System.out.println(ans);
						return;
					}
				}
			}	
		}
		
		System.out.println(-1);
		return;
	}
}

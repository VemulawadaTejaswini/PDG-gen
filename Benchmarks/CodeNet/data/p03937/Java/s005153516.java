import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		int i,j;

		String a_pre[] = new String[h];
		char a[][] = new char[h][w];
		boolean flag[][] = new boolean[h][w];
		boolean ans = true;

		for(i=0; i<h; i++){
			a_pre[i] = sc.next();
		}

		for(i=0; i<h; i++){
			a[i] = a_pre[i].toCharArray();
			for(j=0; j<w; j++){
				if('#' == a[i][j]){
					flag[i][j] = true;
				}
			}
		}

		i = 0; j = 0;
		while(ans){
			flag[i][j] = false;
			if(i==h-1 && j==w-1) break;
			if(j+1 < w && i+1 < h){
				if('#' == a[i+1][j]){
					i++;
				}else if('#' == a[i][j+1]){
					j++;
				}
			}else if(j+1 >= w){
				if('#' == a[i+1][j]){
					i++;
				}else{
					ans = false;
				}
			}else if(i+1 >= h){
				if('#' == a[i][j+1]){
					j++;
				}else{
					ans = false;
				}
			}else{
				ans = false;
			}
		}

		i = 0; j = 0;
		while(ans && i<h){
			while(ans && j<w){
				if(flag[i][j] == true) ans = false;
				j++;
			}
			i++; j=0;
		}

		if(ans){
			System.out.println("Possible");
		}else{
			System.out.println("Impossible");			
		}

	}
}
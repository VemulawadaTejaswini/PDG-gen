import java.util.*;

public class Main{
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
	int X = sc.nextInt();
		int i = 2;
		int ans = 0;
		if(X == 1){
			System.out.println("1");
		}else{
			while(i*i <= X){
				int tmp = i*i;
				while(tmp <= X){
					tmp*=i;
				}
				tmp /= i;
				if(tmp > ans)
				ans = tmp;
				i++;
			}
			System.out.println(ans);
		}
	}
 
}
int X = sc.nextInt();
		int i = 2;
		int ans = 0;
		if(X == 1){
			System.out.println("1");
		}else{
			while(i*i <= X){
				int tmp = i*i;
				while(tmp <= X){
					tmp*=i;
				}
				tmp /= i;
				if(tmp > ans)
				ans = tmp;
				i++;
			}
			System.out.println(ans);
		}
	}
 
}
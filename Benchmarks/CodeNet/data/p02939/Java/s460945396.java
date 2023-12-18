import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		char tmp = 0;

		long leg = inp.length();
		long cnt = 0;
		long n = 0;
		Boolean past2 = false;
		long ans = 0;

		for(int i = 0 ; i < leg ; i++){
			if(i == 0){
				tmp = inp.charAt(0);
				cnt++;
			}else{
				if(tmp == inp.charAt(i)){
					cnt++;
					if(cnt == 3){
						n++;
						cnt = 0;
					}
				}else{
					ans += 2*n;
					if(cnt != 0){
						ans += 1;
					}
					if(cnt == 2 && past2){
						ans += 1;
						past2 = false;
					}else{
						if(cnt == 2){
							past2 = true;
						}else{
							past2 = false;
						}
					}
					tmp = inp.charAt(i);
					cnt = 1;
					n = 0;
				}
			}
		}
		ans += 2*n;
		if(cnt != 0){
			ans += 1;
		}
		if(cnt == 2 && past2){
			ans += 1;
			past2 = false;
		}

		System.out.println(ans);
	}

}
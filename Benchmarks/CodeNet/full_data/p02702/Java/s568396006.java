import java.util.*;

public class Main {
	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int len = str.length();
		if(len<4){
			System.out.println(0);
			return;
		}

		int dst = 4;
		long cnt = (long) 0;
		
		while(dst<20){

			for(int i = 0; (i+dst)<len+1; i++){
				String substr = str.substring(i, i+dst);
              	long chk = Long.valueOf(substr);
              
				if((chk%2019)==0){
					cnt++;
				}
			}

			dst++;
		}

		System.out.println(cnt);
		return;
	}


}

import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		String T = sc.next();
		int flag = 0;
		int i = 0;
		int j = 0;
		int len = S.length();
		
		String str[] = new String[len];
		String strT[] = new String[len];
		int whrS[] = new int[len];
		int whrT[] = new int[len];
		
		for(i = 0;i < len; i++){
			str[i] = S.substring(i,i + 1);
		}
		i = 0;
		for(i = 0;i < len; i++){
			strT[i] = T.substring(i,i + 1);
		}
		i = 0;
		int k = 0;
		int flagS = 0;
		int flagT = 0;
		while(i < len){
			j = 1;
			j = i + j;
			while(j < len){
				if(str[i].equals(str[j])){
					whrS[i] = k;
					whrS[j] = k;
					k++;
					flagS = 1;
				}
				whrT[i] = 0;
				whrT[j] = 0;
				j++;
			}
			i++;
		}
		i = 0;
		j = 0;
		while(i < len){
			j = 1;
			j = i + j;
			while(j < len){
				if(strT[i].equals(strT[j])){
					whrT[i] = k;
					whrT[j] = k;
					k++;
					flagT = 1;
				}
				whrT[i] = 0;
				whrT[j] = 0;
				j++;
			}
			i++;
		}
		i = 0;
		j = 0;
		if(flagS == 1 || flagT == 1){
			for(i = 0; i < len;i++){
				if(whrS[i] == whrT[j]){
					flag = 0;
			}
				
		}
			if(flag == 0){
				System.out.println("Yes");
				return;
		}
			
			System.out.println("No");
			return;
		}
		else{
			System.out.println("Yes");
		}
	}
}
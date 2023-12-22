import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			char[] a = sc.next().toCharArray();
			int ca = 1;
			int cb = 1;
			int k = 0;
			boolean flagA = false;
			boolean flagB = false;
			
			for(int i=1;i<a.length;i++){
				if(a[i]==a[i-1]){
					ca++;
				}else{
					if(a[i-1]=='J' && a[i]=='O'){
						cb = ca;
						ca = 1;
						flagA = true;
					}else if(flagA==true && cb>=ca && a[i]=='I'){
						cb = ca;
						ca = 1;
						flagA = false;
						flagB = true;
					}else if(flagB==true && cb<=ca){
						k = Math.max(k, cb);
						ca = 1;
						flagA = false;
						flagB = false;
					}else{
						ca = 1;
						flagA = false;
						flagB = false;
					}
				}
			}
			if(flagB==true && cb<=ca) k = Math.max(k, cb);
			System.out.println(k);
		}
	}
}
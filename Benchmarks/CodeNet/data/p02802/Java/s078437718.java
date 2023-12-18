import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); //n問の問題
		int m = stdIn.nextInt(); //m回の提出
		
		int []a = new int[m]; //a[i] どの問題を解いたか
		String []b = new String[m]; //b[i] 正解か不正解か
		
		int cnta = 0; //正解数をcntする変数
		int cntb = 0; //不正解数をcntする変数
		
		boolean hanteia = false;
		
		for(int i = 0; i < m; i++) {
			a[i] = stdIn.nextInt();
			b[i] = stdIn.next();
		}
		
		
		Map<Integer,String> map = new HashMap<>();
		
		for(int i = 0; i < m; i++) {
			if(!map.containsKey(a[i])) { //もし、ある問題に対して、まだ提出していない場合。
				map.put(a[i],b[i]);
				hanteia = false;
				if(map.get(a[i]).equals("WA")) {
					cntb++;
				}else {
					cnta++;
					map.put(a[i], b[i]);
					hanteia = true;
				}
			}else { //すでに提出はしている場合
				if(map.get(a[i]).equals("WA") && !hanteia && b[i].equals("AC")) {
					map.put(a[i], b[i]);
					cnta++;
					hanteia = true; //hanteiaがtrueになるのはACが出た時
				}else if(map.get(a[i]).equals("WA") && !hanteia){
					cntb++;
				}else {
					continue;
				}
			}
			
		}
		
		System.out.println(cnta+" "+cntb);
		
		
		
	}

}

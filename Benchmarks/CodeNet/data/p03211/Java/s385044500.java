    import java.util.*;
    public class Main {
    	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		String s = sc.next();
    		// 出力
                int len = s.length(); 
                
                String subs;
                int diff;
                int mindiff = 0;
                for (int i = 1; i <= len -2; i++){
                    subs = s.substring(i -1, i +2);
                    //System.out.println(subs);
                    diff = Math.abs(753 - Integer.parseInt(subs));
                    if (i == 1 || diff < mindiff) {
                        mindiff = diff;
                    }
                }
                System.out.println(mindiff);
    	}
    }
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
       
        ArrayList<String> sList = new ArrayList<>();
      
		for (int i = 0; i < n; i++) {
          String s = sc.next();
          String[] chars = s.split("");
          Arrays.sort(chars);
          String master = "";
          for (String part : chars) {
            master += part;
          }
          sList.add(master);
        }
       
        int ans = 0;
        for (int i = 0; i < n; i++) {
          String sample = sList.get(0);
          sList.remove(0);
          int count = 0;
          while(sList.indexOf(sample) >= 0) {
            ans++;
            count++;
            sList.remove(sList.indexOf(sample));
            if (count > 1) {
              ans++;
            }
          }
          if (sList.size() == 0) {
            break;
          }
        }
		
        
    
		// 出力
		System.out.println(ans);
	}
}
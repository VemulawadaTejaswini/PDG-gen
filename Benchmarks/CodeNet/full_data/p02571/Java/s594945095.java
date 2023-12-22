import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
      	String t = sc.nextLine();
      
        String[] ss = new String[s.length()];
      	String[] tt = new String[t.length()];
      
      	for(int i = 0; i < ss.length;i++){
          ss[i] = String.valueOf(s.charAt(i));
        }
      
      for(int i = 0;i < tt.length;i++){
        tt[i] = String.valueOf(t.charAt(i));
      }
      
      int c = 0;
      int count = 0;
      int ans = 0;
      
      
      
      for(int i = 0;i <= ss.length - tt.length;i++){
        for(int j = 0; j < tt.length;j++){
          //System.out.println(ss[i] + " " + tt[j]);
          if(ss[i + count].equals(tt[j])){
            c++;
          }
          count++;
            if(c == tt.length){
            System.out.println(0);
            break;
        	}
        }
        if(c > ans){
          ans = c;
        }
        c = 0;
        count = 0;
      }
        System.out.println(t.length() - ans);
    }
}

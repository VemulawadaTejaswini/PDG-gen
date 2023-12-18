import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      String[] d = new String[k];
      for(int i = 0;i < k;i++){
        d[i]=String.valueOf(sc.nextInt());
      }
      int cnt = 0;
      for(int i = n;i < 1000000000;i++){
        String s = String.valueOf(i);
        for(int j = 0;j < s.length();j++){
        	if(Arrays.asList(d).contains(s.substring(j,j+1)))cnt++;
        }
        if(cnt==0){
        	System.out.println(i);
          return;
        }
        cnt = 0;
      }
    }
}
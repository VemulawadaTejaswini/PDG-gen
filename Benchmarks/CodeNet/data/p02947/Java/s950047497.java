import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      char[][] c = new char[n][];
      int cnt = 0;
      String s = "";
      HashMap<String,Integer> map = new HashMap<String,Integer>();
      for(int i = 0;i < n;i++){
      	c[i] = sc.next().toCharArray();
        Arrays.sort(c[i]);
        for(int j = 0;j < 10;j++)s += String.valueOf(c[i][j]);
        if(map.get(s)==null){
        	map.put(s,0);
        }else{
        	map.replace(s,map.get(s),map.get(s)+1);
            cnt += map.get(s);
        }
        s = "";
      }
      System.out.println(cnt);
    }
}

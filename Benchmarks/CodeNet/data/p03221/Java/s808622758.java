import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {
	  public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	 
	    int n = sc.nextInt(); //県の数
	    int m = sc.nextInt(); //市の数
	    Map<Integer,int[]> map = new TreeMap<Integer,int[]>();
	 
	    for(int i=0; i<m; i++){
	        int[] array = new int[2];
	        array[0] = i;
	        array[1] = sc.nextInt(); //県番号
	        int b = sc.nextInt(); //誕生年
	        map.put(b,array);
	    }
	    int[] ary = new int[n]; //県の数を格納
	    String[] s = new String[m]; //IDを格納
	 
	    for(int[] num :map.values()){
	      ary[num[1]-1]++;
	      s[num[0]] = String.format("%06d%06d",num[1],ary[num[1]-1]);
	    }
	    
	    for(String a: s) {
	    	System.out.println(a);
	    }
	  }
}

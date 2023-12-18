import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String line1 = br.readLine();
      String str[] = line1.split(" ");
      int n = Integer.parseInt(str[0]),x = Integer.parseInt(str[1]);
      String line2 = br.readLine();
      ArrayList<Integer> candyList = new ArrayList<Integer>();
      for(int i =0;i<n;i++){
         String str2[] = line2.split(" ");
         candyList.add(Integer.parseInt(str2[i]));     
      }
      int count=0;
      if(candyList.get(0)>x){
        candyList.set(0,x);
        count = candyList.get(1)-x;
      }
      for(int i=0;i<n-1;i++){
        int candyNum = candyList.get(i)+candyList.get(i+1);
        if(candyNum>x){
          candyList.set(i+1,candyList.get(i+1)-(candyNum-x));
          count = count + (candyNum-x);
        }
      }
       System.out.println(count); 
	}
}
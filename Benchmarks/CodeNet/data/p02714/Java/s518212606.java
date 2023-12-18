import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String str = sc.next();
	int count = 0;
    for(int i=0;i<num-2;i++){
      for(int j=1;j<num-1;j++){
              if(i>=j){
                continue;
      		  }
	      for(int k=2;k<num;k++){
              if(j>=k){
                continue;
      		  }
          //  System.out.println("i="+i+"j="+j+"k="+k);
          	if(j-i == k-j){
            	continue;
          	}
            boolean boo = check(str.charAt(i),str.charAt(j),str.charAt(k));
            if(boo){
              count++;
              //System.out.print("1="+str.charAt(i));
              //System.out.print("2="+str.charAt(j));
              //System.out.println("3="+str.charAt(k));
            }
            
    	  }        
      }
    }
	System.out.println(count);
   }
	static boolean check(char a,char b,char c){
      //a,b,cに同じ文字列があるか確認する
      if(a==b||a==c||b==c){
        return false;
      }
      return true;
    }
}
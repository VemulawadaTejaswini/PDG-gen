import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
       Map<Integer,Integer> m = new HashMap<>();
       int k = sc.nextInt();
       if(m.get(k)==null) {
      for(int i=2;i<=k;i++) {
    	  int a = m.get(i-1);
    	  boolean islunlun=false;
    	  int y;
    	  while(!islunlun)
    	  {
    		   y = a+1;
    		   if(isLunlunNumber(y)) {
    			   islunlun=true;
    		   }
    	  }
    	  m.put(i, y);
    	  
      }
      System.out.println(m.get(k));
       }else {
    	   System.out.println(m.get(k));
       }
        
  }

	private static boolean isLunlunNumber(int y) {
		// TODO Auto-generated method stub
		int digits=0;
		int temp;
		List<Integer> digitList=new ArrayList<>();
		while(y>0) {
			y/=10;
			digitList.add(y%10);
			digits++;
		}
		if(digits==1) {
			return true;
		}else {
			for(int i=0;i<digitList.size()-1;i++) {
				 temp=Math.abs(digitList.get(i)-digitList.get(i+1));
				if(temp!=1 && temp!=0) {
					return false;
				}
			}
		}
		return true;
		
	}
}
        

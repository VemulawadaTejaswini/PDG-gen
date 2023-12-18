import java.util.*;
class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int m = scan.nextInt();
      if(n>m){
      	System.out.println("-1");
        return;
      }
      int [] mm = new int[m+1];//[0,1,2,3]
      
      while(m-->0){
        mm[scan.nextInt()] = scan.nextInt();
      }
      
        for(int i=1;i<1000;i++){
          String s= i+"";
          if(s.length()<n){
          continue;
          }
          //System.out.println(Arrays.toString(mm));
          boolean found = false;
          for(int j=1;j<mm.length;j++){
            if(s.charAt(j-1)-'0'!=mm[j]){
              found = true;
            }
          }
          if(!found)
          {
          	System.out.println(i);
            return;
          }
          
    	}
      System.out.println("-1");
}
}
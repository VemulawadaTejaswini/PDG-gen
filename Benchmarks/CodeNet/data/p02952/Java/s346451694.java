import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
      ArrayList list = new ArrayList<Integer>();
      String s = Integer.toString(n);
      int keta = s.length();
      //System.out.println(keta);
      //System.out.println(last);
      
      int result=0;
      int count=0;
      int amatta=0;
      while(n!=0){
        
        int right = n % 10;
        n = (int) n / 10;
        if(count%2==0){ //奇数桁
          //System.out.println(count);
          //System.out.println(last);
          if(count+1!=keta){
          result+=9*(Math.pow(10,count))+amatta;
          amatta+=right*(Math.pow(10,count));
          }else{
            //System.out.println("last");
          result+=(right-1)*(Math.pow(10,count))+amatta+1;
          amatta+=right*(Math.pow(10,count));
          }
          
          //System.out.println("き");
          //System.out.println(result);
          //System.out.println(amatta);
        }else{ //偶数桁
          //System.out.println("ぐ");
          amatta+=right*(Math.pow(10,count));
          //System.out.println(amatta);
        }
        

        count++;
        
      }
      System.out.println(result);
	}
}
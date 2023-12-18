import java.util.*;

class Main{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
      	String s = sc.next();
          String t = sc.next();
      	String[] s_arr = s.split("");
      	String[] t_arr = t.split("");
      	for(int i =0; i<s_arr.length;i++){
        	if(!s_arr[i].equals(t_arr[i])){
              System.out.println("No");
              return;
            }
        }
      if(s_arr.length == t_arr.length-1){
		System.out.println("Yes");
      }else{
          System.out.println("No");
      }
    }
  

}
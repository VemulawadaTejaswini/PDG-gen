import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		char[] a = new char[n];
		for(int i=0; i<a.length; ++i){
			a[i] = scn.next();
		}
      int cr = 0;
      int cb = 0;
      for(int i=0; i<a.length; ++i){
        if(a[i]=="R"){
          cr = cr + 1;
        }
        if(a[i]=="B"){
          cb = cb + 1;
        }
      }
      if(cr>cb){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
	}
}
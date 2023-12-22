import java.util.*;

public class Main {
	public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	String n = scn.next();
      int ac = 0;
      int wa = 0;
      int tle = 0;
      int re = 0;
      String[] a = new String[n];
      for(i=0; i<a.length; ++i){
        a[i] = sc.next();
      }
      for(i=0; i<a.length; ++i){
        if(a[i]==AC){
          ac = ac+1;
        }if(a[i]==WA){
          wa = wa+1;
        }if(a[i]==TLE){
          tle = tle+1;
        }if(a[i]==RE){
          re = re+1;
        }
      }
      System.out.println("AC × "+ac);
      System.out.println("WA × "+wa);
      System.out.println("TLE × "+tle);
      System.out.println("RE × "+re);
	}
}
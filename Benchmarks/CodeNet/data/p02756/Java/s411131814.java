import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int n = sc.nextInt();
    int flg = 1; //normal
    for (int i=0;i<n;i++){
    	int a = sc.nextInt();
    	if (a==1){
    		flg*=-1;
    		continue;
    	}
    	int b = sc.nextInt();
    	String c = sc.next();
    	if (b==1){
    		if (flg == 1){
    			s = c+s;
    		}else{
    			s = s+c;
    		}
    		continue;
    	}
    		if (flg == 1){
    			s = s+c;
    		}else{
    			s = c+s;
    		}

    }
    if (flg == 1){
    System.out.print(s);
    return;
}
char[] aaa = s.toCharArray();
    for (int i=aaa.length-1;i >=0 ;i--){
    	System.out.print(aaa[i]);
    }
  }
}




import java.util.*;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      int len = S.length();
      int c = 0;
      for(int Si=4; Si<=len;Si++){
        for(int i=0; i<=len-Si;i++){
          String j = S.substring(i, Si+i);
          long num = Long.parseLong(j);
          if(num%2019==0)
            c += 1;
        }
      }
	  System.out.println(c);
    }
}


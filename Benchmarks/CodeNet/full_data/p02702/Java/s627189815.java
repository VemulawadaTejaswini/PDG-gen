import java.util.*;

class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      int len = S.length();
      int c = 0;
      for(int i=0; i<=len-4;i++){
        String j = S.substring(i, i+4);
        int num = Integer.parseInt(j);
        
        if(num%2019==0)
          c += 1;
      }
      for(int i=0; i<=len-5;i++){
        String j = S.substring(i, i+5);
        int num = Integer.parseInt(j);
        if(num%2019==0)
          c += 1;
      }
      for(int i=0; i<=len-6;i++){
        String j = S.substring(i, i+6);
        int num = Integer.parseInt(j);
        if(num%2019==0 && num <= 200000)
          c += 1;
      }
	  System.out.println(c);
    }
}


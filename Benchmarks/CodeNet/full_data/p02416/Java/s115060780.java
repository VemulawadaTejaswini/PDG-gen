import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      while(true){
          String str = sc.next();
          if(str.equals("0")) break;
          int a = str.length();
          char[] m = new char[a];
          int sum=0;
          int[] M = new int[a];
          for(int i=0;i<a;i++){
            m[i] = str.charAt(i);
            M[i] = m[i]-'0';
            sum = sum + M[i];
        }
          System.out.println(sum);
    }
      sc.close();
    }
}

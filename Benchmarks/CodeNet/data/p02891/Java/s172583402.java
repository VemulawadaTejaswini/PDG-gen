import java.util.Scanner;

public class Main {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] chars = s.toCharArray();


    long count = 0;
    for(int i = 0; i< s.length() -1; i++){
      if(chars[i] == chars[i+1]){
        count++;
        chars[i+1] = 'A';
      }
    }
    long k = sc.nextLong();
    count = count * k;
    boolean isSameChar = chars[0] == chars[s.length()-1];

    if(s.length() == 1 && k > 2){
      count = k%2 == 0?k/2:(k - 1) / 2;
    } else if(isSameChar){
      count += k - 1L;
    }
    System.out.println(count);

  }

}

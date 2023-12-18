import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String c = sc.next();
    char[] al = {'a','b','c','d','e','f','g','h',
                 'i','j','k','l','m','n','o','p',
                 'q','r','s','t','u','v','w','x','y','z'};
    
    for(int i = 0; i < 25; i++){
      if(c == al[i]){
        System.out.println(al[i+1]);
      }
    }
    
  }
}

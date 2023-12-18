import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    char c[] = s.toCharArray();
    int x = 700 ;
    for(int i = 0 ; i < 3 ; i++){
      if(c[i] == 'o'){
        x+=100 ;
      }
    }
    System.out.println(x);
    
  }
}

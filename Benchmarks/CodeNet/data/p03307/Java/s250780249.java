import java.util.* ;
class Main {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
    int i = 1 ;
    while(true){
      if((n*i)%2 == 0){
        System.out.println(n*i);
        break ;
      }
      i++;
    }
  }
}

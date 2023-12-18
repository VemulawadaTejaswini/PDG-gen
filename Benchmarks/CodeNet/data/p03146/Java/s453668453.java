import java.util.*;
class Main {
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
    int n= scan.nextInt();
    ArrayList<Integer> a = new ArrayList<>();
    int i = 1 ;
    while(true){
      
      
      //System.out.println(n);
      if(a.contains(n)){
        System.out.println(i);
        break;
      }else{
        a.add(n);
      }
      
      if( n %2 == 0){
        n = fe(n);
      }else{
        n = fo(n);
      }
      i++;
    }
    
    
  }
  
  static int fe(int n){
    return n/2 ;
  }
  
  static int fo(int n){
    return 3*n + 1 ; 
  }
}

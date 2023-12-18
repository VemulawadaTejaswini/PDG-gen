import java.util.* ; 
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
	int x = scan.nextInt() ;
    int y =scan.nextInt() ;
    int i = 0 ;
    String[] s = new String[3];
    while(i<x){
      s[i] = scan.next(); 
      i++ ;
    }
    
    for( int k = 0 ; k<x +2 ; k++){
      for(int j = 0 ; j<y+2 ; j++){
        if( k ==0 || k == x+1 ||j==0 ||j==y+1){
          System.out.print("#");
        }else{
          System.out.print(s[k-1].toCharArray()[j-1]);
        }
      }
      System.out.println();
    }
     
  }
}

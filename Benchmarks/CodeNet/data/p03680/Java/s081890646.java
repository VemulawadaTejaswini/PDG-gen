import java.util.* ; 
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int a  = scan.nextInt() ;
    int arr[] = new int [a] ;
    for (int i = 0 ; i <a ; i++){
      arr[i] = scan.nextInt() ;
    }
    
    if(arr.length%2 != 0 ){
      System.out.println(arr.length /2 +1 );
    }else{
      System.out.println("-1");
    }
    
  }
}

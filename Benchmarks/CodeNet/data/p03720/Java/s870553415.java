import java.util.* ; 
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
	int x = scan.nextInt() ;
  int y = scan.nextInt() ;
    int a[] = new int[y];
    int b[] =new int[y];
    
    for(int i = 0 ; i< y  ;i++){
      a[i] = scan.nextInt();
      b[i] =scan.nextInt() ;
    }
    
    for(int i = 1 ; i<= x ; i++){
      int count = 0;
      for(int j = 0 ; j<y ;j++){
        if(a[j] == i || b[j] == i){
        count++;
      	}
      }
      if(count>0){
        System.out.println(count);
      }
    }
     
  }
}

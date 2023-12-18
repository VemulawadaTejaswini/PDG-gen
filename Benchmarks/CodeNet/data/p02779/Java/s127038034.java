class Main{
  
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int length = scan.nextInt();
    int[] arr = new int[length-1];
    while(length>0){
      arr[length] = scan.nextInt();
      length--;
    }
    
    
  }
  
  
}
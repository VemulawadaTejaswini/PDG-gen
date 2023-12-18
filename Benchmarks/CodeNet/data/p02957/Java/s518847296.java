class Main() {
  
public static void Main(String args[]){
  long a = Long.parseLong(args[0]);
  long b = Long.parseLong(args[1]);
  
  if((b+a)%2==1){
    System.out.print("IMPOSSIBLE");
  }else{
    System.out.print((b+a)/2);
  }
}

}
class Main{
  public static void main(String[] args) {
  
   int K = K(600, 700);
    
    if (number(K)){
      System.out.println("OK");
    } else {
      System.out.println("NG");
    }
     public static int K (int 600, int 700){
       return K > 600 && K < 700;
     }
     public static boolean number(int K) {
      return number K % 8 == 0;
     }
  }
}

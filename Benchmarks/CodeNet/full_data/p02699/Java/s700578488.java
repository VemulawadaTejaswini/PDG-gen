class Main {

  static void bigger(int sheeps, int wolves )
  {
   if(sheeps<wolves)
    System.out.println("unsafe");
   if(sheeps==wolves)
       System.out.println("unsafe");
   else
    System.out.println("safe");
  }

  public static void main(String[] args) {
    bigger(40,23);
    bigger(10,23);
    bigger(23,23);    
  }


}
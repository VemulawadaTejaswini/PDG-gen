  class Main{
    public static void main(String[] a){
      int x = 1;
      int y = 1;
      int result;

      while(true){
        result = x * y;
        
      System.out.println(x + "x" + y " = " + result);
      if(result == 81){
        break;
      }
      if(x < 10){
        x++;
      }else{
        y++;
      }
      }

    }
}
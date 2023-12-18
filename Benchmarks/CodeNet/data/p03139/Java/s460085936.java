public class Main {
  public static void main(String[] args){    
    try{   
      
//    int n = Integer.parseInt(args[0]);
//    int a = Integer.parseInt(args[1]);
//    int b = Integer.parseInt(args[2]);

    int n = 10;
    int a = 5;
    int b = 3;

    if ( n <= (a + b) ){ 
      if ( a > b ) {
        System.out.print(b);
        System.out.print(" ");
        System.out.print(a-b);
      } else {
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b-a);
      }
    } else {
      if ( a > b ) {
          System.out.print(b);
            System.out.print(" ");
            System.out.print("0");
      } else {
            System.out.print(a);
            System.out.print(" ");
            System.out.print("0");
      }
    }
    } catch (java.lang.ArrayIndexOutOfBoundsException e ){
              System.out.println("ArrayIndexOutOfBoundsException!");
    } catch (NumberFormatException e) {
              System.out.print("NumberFormatException!");
    }      
      
  } 
}
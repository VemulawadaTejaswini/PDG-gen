public class StringReverse {
 
  public static void main(String args[]){
    String strOriginal = "abcd123d";
    System.out.println(strOriginal);
   
   
    strOriginal = new StringBuffer(strOriginal).reverse().toString();
       
    System.out.println(strOriginal);
  }
 
}
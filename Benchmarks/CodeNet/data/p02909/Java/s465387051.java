    import java.util.Scanner;
     
    class Weather{
      public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        String S = stdIn.next();
        if(S == "Sunny"){
          System.out.println("Cloudy");
        }else if(S == "Cloudy"){
          System.out.println("Rainy");
        }else{
          System.out.println("Sunny");
        }
      }
    }
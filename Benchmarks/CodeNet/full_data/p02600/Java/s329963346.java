public class Main{
public static void main(String[] args){
  if(args[0] <= 1999 && args[0] >= 1800){
    System.out.println("1");
  }else if(args[0] >= 1600){
    System.out.println("2");
  }else if(args[0] >= 1400){
    System.out.println("3");
  }else if(args[0] >= 1200){
    System.out.println("4");
  }else if(args[0] >= 1000){
    System.out.println("5");
  }else if(args[0] >= 800){
    System.out.println("6");
  }else if(args[0] >= 600){
    System.out.println("7");
  }else if(args[0] >= 400){
    System.out.println("8");
  }
}
}
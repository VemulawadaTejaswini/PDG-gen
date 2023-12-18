 public class Main{
  
  public static void main(String[] args){
    
    if(args[4].equals(args[0])){
      args[2] = args[2] - 1;
    }
    else if(args[4].equals(ball2.name)){
      args[3] = args[3] - 1;
    }
    
    system.out.println(args[2]+" "+args[3]);
    
  }
}
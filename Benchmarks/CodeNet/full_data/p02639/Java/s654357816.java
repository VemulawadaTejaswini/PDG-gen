public class Main{
  public static void main(String[] args){
    int[] x = new int[5];
    
    for(int i=0; i<x.length; i++){
      x[i] = new java.util.Scanner(System.in).nextInt();
    }
    
    for(int i=0; i<x.length; i++){
      if(x[i] == 0){
        i+=1;
        System.out.println(i);
        break;
      }
    }
  }
}
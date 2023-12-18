import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int S=scan.nextInt();
    scan.nextLine();
    String[] N=scan.nextLine().split("");
    int count=0;

    for(int i=0;i<N.length-1;i++){
      if(!N[i].equals(N[i+1])){
          count++;
      }
    }
      System.out.println(count+1);
  }
}
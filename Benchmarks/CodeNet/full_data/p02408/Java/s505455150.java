import java.util.Scanner;
  
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    boolean[][] cards = new boolean[4][13];
  
    for(int x = 0; x < number; x++){
      String pattern = sc.next();
      int rank = sc.nextInt();
      if(pattern.equals("S")){
        cards[0][rank-1] = true;
      }else if(pattern.equals("H")){
        cards[1][rank-1] = true;
      }else if(pattern.equals("C")){
        cards[2][rank-1] = true;
      }else{
        cards[3][rank-1] = true;
      }
    }
  
    for(int y = 0; y < 13; y++){
      if(cards[0][y]){
      }else{
        System.out.println("S "+(y+1));
      }
    }
    for(int y = 0; y < 13; y++){
      if(cards[1][y]){
      }else{
        System.out.println("H "+(y+1));
      }
    }
  	for(int y = 0; y < 13; y++){
      if(cards[2][y]){
      }else{
        System.out.println("C "+(y+1));
      }
    }
    for(int y = 0; y < 13; y++){
      if(cards[3][y]){
      }else{
        System.out.println("D "+(y+1));
      }
    }
  }
}

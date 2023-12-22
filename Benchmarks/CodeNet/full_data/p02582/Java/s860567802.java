import java.util.Scanner;

public class Main{
  public static void main(String args[]){
  Scanner scanner = new Scanner(System.in);
  String esu = scanner.next();
  int raincnt = 0;
  for(int i=0;i<3;i++){
    if(esu.charAt(i)=='R'){    
      raincnt++;
    }else{
      raincnt = 0;
    }
  }
  System.out.println(raincnt);
  
  }
}
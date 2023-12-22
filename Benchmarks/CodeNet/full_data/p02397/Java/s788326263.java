import java.util.Scanner;
class Main{
  public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  
  for(int i = 1; ; i++){
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      int numbers[] = {x, y};
      int temp;
      if(x == 0 && y == 0){
          break;
          }
      for(int j = 0; j < numbers.length - 1; j++){
          
          if(numbers[j] > numbers[j + 1]){
              temp = numbers[j];
              numbers[j] = numbers[j + 1];
              numbers[j + 1] = temp;
          }
          System.out.println(numbers[0] + " " + numbers[1]);
      }
      
    }
  }
}
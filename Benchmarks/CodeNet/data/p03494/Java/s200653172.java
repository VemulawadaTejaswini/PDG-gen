import java.io.*;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
    
    int number = Integer.parseInt(br.readLine());//数の個数
    String input = br.readLine();//数字の羅列
    int[] numbers = new int[number];//数字の配列
    
    //配列に数字を格納していく
    for(int i = 0; i<number - 1; i++){
      int space = input.indexOf(' ');
      numbers[i] = Integer.parseInt(input.substring(0, space));
      input = input.substring(space+1);
    }
    numbers[number - 1] = Integer.parseInt(input);
    
    //一つ目の数は何回２で割り切れるか？
    int minEven = 0;
    while(numbers[0] %2 == 0){
      numbers[0] = numbers[0] /2;
      minEven++;
    }
    //2つ目以降の数は1つ目より２で割り切れるか？
    for(int j = 1; j<number; j++){
      for(int i = 0; i < minEven; i++){
        if(numbers[j] % 2 != 0){
          minEven = i;
          break;
        }
        else{numbers[j] = numbers[j] /2;}
      }
    }
    System.out.println(minEven);
  }
}

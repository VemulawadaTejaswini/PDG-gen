import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int abcde[] = new int[5];
    int bottom[] = new int[5];
    int sum = 0;
    for(int i=0;i<5;i++){
      abcde[i]=sc.nextInt();
      bottom[i]=abcde[i]%10;
      if(bottom[i] == 0){
        sum += abcde[i];
      } else {
        sum += abcde[i] + 10-bottom[i];
      }
    }
    int min = bottom[0];
    for(int j=1;j<5;j++){
      if(bottom[j] < min && bottom[j] != 0){
        min = bottom[j];
      }
    }
    for(int k=0;k<5;k++){
      if(bottom[k] == min){
        sum -= abcde[k] + 10-bottom[k];
        sum += abcde[k];
        break;
      }
    }
    System.out.println(sum);
  }
}
    
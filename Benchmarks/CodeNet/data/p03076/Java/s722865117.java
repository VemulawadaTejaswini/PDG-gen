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
    }
    int min = bottom[0];
    for(int j=1;j<5;j++){
      if(bottom[j] < min && bottom[j] != 0){
        min = bottom[j];
      }
    }
    for(int k=0;k<5;k++){
      if(bottom[k] == min || bottom[k] == 0){
        sum += abcde[k];
      }
      else {
        sum += abcde[k] + 10-bottom[k];
      }
    }
    System.out.println(sum);
  }
}
    
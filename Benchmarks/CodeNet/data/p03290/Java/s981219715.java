import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int g = sc.nextInt();
    int[] pronums = new int[d + 1];
    int[] bons = new int[d + 1];
    for(int i = d; i >= 1; i--){
      pronums[i] = sc.nextInt();
      bons[i] = sc.nextInt();
    }
    
    // no problem in input
    
    int min = 1000;
    int sum;
    int num;
    for(int i = 0; i < (1 << d); i++){
      sum = 0;
      num = 0;
      for(int j = 0; j < d; j++){
        if((i >> j & 1) == 1){
          sum += 100 * (d - j) * pronums[j + 1]+ bons[j + 1];
          num += pronums[j + 1];
        }
      }
      if(sum >= g){
        min = Math.min(min, num);
        continue;
      }
      for(int j = 0; j < d ; j++){
        if((i >> j & 1) == 0){
          if((double)(g - sum) / ((d - j) * 100) > pronums[j + 1] - 1){
            break;
          }else{
            num += ((g - sum) + ((d - j) * 100) - 1) / ((d - j) * 100);
            min = Math.min(min, num);
          }
        }
      }
    }
    System.out.println(min);
  }
}
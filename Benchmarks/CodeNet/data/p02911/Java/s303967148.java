import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int in1 =sc.nextInt();
    int in2 =sc.nextInt();
    int in3 =sc.nextInt();
    
      // 得点の配列を作る int1人で、各点は int2 
      int ten[] = new int[in1];
      
          for (int k = 0; k < in1 ; k++){
          	ten[k] = in2;
          }
      while (sc.hasNextInt()){
        int intnow = sc.nextInt();
          for (int i = 0; i < in1 ; i++){
          	if ((ten[i] > 0)  && (i != intnow-1 )){
                  ten[i] = ten[i] - 1;
              }
          }
      }
      
      for (int j = 0; j < in1 ; j++){
      	if (ten[j] > 0) {
  			System.out.println("Yes");
      	} else {
  			System.out.println("No");
      	}
      }
  }
}
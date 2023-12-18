import java.util.Scanner;
import java.lang.Math;
 
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    int[] x = new int[n * d];
    double[] powerBox = new double[n * 2];
    double[] resultBox = new double[n];
    if(d == 1){
        System.out.println(n*2);
    }else if(d < 4){
        for(int i = 0;i < n * d;i++){
            x[i] = sc.nextInt();
        }

        for(int i = 0;i < n * 2 - d;i++){
            powerBox[i] = Math.pow((x[i] - x[i + 2]),2);

        }

        int count = 0;
        for(int i = n * 2 - d;i < n * 2;i++){
            powerBox[i] = Math.pow((x[i] - x[count]),2);
            count++;
        }

        int CorrectCount = 0;
        int intBox = 0;
        for(int i = 0;i < n;i += 2){
            resultBox[i] = Math.sqrt(powerBox[i] + powerBox[i + 1]);
            intBox = (int)resultBox[i];
            if((resultBox[i] - intBox) == 0.0){
                CorrectCount++;
            }
        }
        System.out.println(CorrectCount);
    }else{
        System.out.println(0);
    }
  }
}
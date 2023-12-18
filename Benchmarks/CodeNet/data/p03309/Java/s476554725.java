import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.nextLine());
    long[] as = new long[N];
    String[] firstInput = sc.nextLine().split("[\\s]+");
    int b = 0;
    for(int i = 0; i < N; i++) {
      as[i] = Long.parseLong(firstInput[i]);
    }
    // Arrays.sort(as);
    long crrSum = 0;
    long prevSum = 0;
    long plusSum = 0;
    long minusSum = 0;
    long zeroSum = 0;
    // 0の時
    for(int i = 0; i < N; i++) {
      zeroSum += Math.abs(as[i] - (b + i + 1));
    }

    b = 1;
    for(int i = 0; i < N; i++) {
      plusSum += Math.abs(as[i] - (b + i + 1));
    }

    b = -1;
    for(int i = 0; i < N; i++) {
      minusSum += Math.abs(as[i] - (b + i + 1));
    }
    b = 0;

    if(zeroSum > plusSum) {
      //プラスする見込みがある
      b = 2;
      crrSum = plusSum;
      prevSum = crrSum;
      while(true) {
        crrSum = 0;
        for(int i = 0; i < N; i++) {
          crrSum += Math.abs(as[i] - (b + i + 1));
        }
        if(crrSum < prevSum) {
          b += 1;
          prevSum = crrSum;
          continue;
        } else {
          crrSum = prevSum;
          break;
        }
      }
      System.out.println(crrSum);
    } else if(zeroSum > minusSum){
      b = -2;
      crrSum = plusSum;
      prevSum = crrSum;
      while(true) {
        crrSum = 0;
        for(int i = 0; i < N; i++) {
          crrSum += Math.abs(as[i] - (b + i + 1));
        }
        if(crrSum < prevSum) {
          b -= 1;
          prevSum = crrSum;
          continue;
        } else {
          crrSum = prevSum;
          break;
        }
      }
      System.out.println(crrSum);
    } else {
      System.out.println(zeroSum);
    }
  }
}

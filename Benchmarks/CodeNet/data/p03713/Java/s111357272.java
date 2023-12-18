import java.util.*;


public class Main {

  public static long cal(long S1, long S2, long S3){
    return Math.max(Math.abs(S1-S2), Math.max(Math.abs(S2-S3), Math.abs(S3-S1)));
  }

  public static long search(long H, long W){
    long min = Long.MAX_VALUE;
    for(int h = 1; h < H; h++){
      long S1 = h * W;
      long H1 = H - h;

      // case 1
      long H2 = H1/2;
      long H3 = H1 - H2;
      long S2 = H2 * W;
      long S3 = H3 * W;
      long score = cal(S1, S2, S3);
      if (score < min){
        min = score;
      }

      // case 2
      long W2 = W/2;
      long W3 = W - W2;
      S2 = H1 * W2;
      S3 = H1 * W3;
      score = cal(S1, S2, S3);
      if (score < min){
        min = score;
      }
    }
    return min;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long H = sc.nextLong();
    long W = sc.nextLong();
    System.out.println(Math.min(search(H, W), search(W, H)));
  }
}
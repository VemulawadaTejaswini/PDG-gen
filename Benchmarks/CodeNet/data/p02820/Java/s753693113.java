import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();    
    int k = sc.nextInt();    
    int r = sc.nextInt();    
    int s = sc.nextInt();    
    int p = sc.nextInt();    
    String t = sc.next();
    char rivalHands[] = new char[n];
    
    int result = 0;
    for (int i=0; i<n; i++) {
      rivalHands[i] = t.charAt(i);
      if (i<k) {
        result += addPoint(rivalHands[i], r, s, p);
      }
      else {
        if (rivalHands[i-k]==rivalHands[i]) {
          rivalHands[i] = 'n';
        }
        else {
          result += addPoint(rivalHands[i], r, s, p);
        }
      }
    }
    System.out.println(result);
  } 
  
  public static int addPoint(char hand, int r, int s, int p) {
    int point = 0;
    if (hand=='r') {
      point = p;
    }
    else if (hand=='s') {
      point = r;
    }
    else if (hand=='p') {
      point = s;
    }
    return point;
  }
}
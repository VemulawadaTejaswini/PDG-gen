import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int count, m, a, r, c, h;
    count = m = a = r = c = h = 0;
    
    for(int i = 0; i < N; i++){
      String str = sc.nextLine();
      if(str.charAt(0) == 'M'){
        count++;
        m++;
      }else if(str.charAt(0) == 'A'){
        count++;
        a++;
      }else if(str.charAt(0) == 'R'){
        count++;
        r++;
      }else if(str.charAt(0) == 'C'){
        count++;
        c++;
      }else if(str.charAt(0) == 'H'){
        count++;
        h++;
      }
    }
    
    int ans = 0;
    if(count > 2){
      ans += m * a * r;
      ans += m * a * c;
      ans += m * a * h;
      ans += m * r * c;
      ans += m * r * h;
      ans += m * c * h;
      ans += a * r * c;
      ans += a * r * h;
      ans += a * c * h;
      ans += r * c * h;
    }
    System.out.println(ans);
  }
}
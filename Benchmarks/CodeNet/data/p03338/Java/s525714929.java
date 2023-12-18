import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();

    int num = 0;
    for(int i=1; i<n; i++){
      Set<Character> set_1 = new HashSet<>();
      for(int j=0; j<i; j++)
        {
          set_1.add(s.charAt(j));
        }

      Set<Character> set_2 = new HashSet<>();
      for(int j=i; j<n; j++)
        {
          set_2.add(s.charAt(j));
        }

        int count = 0;

        for(char c = 'a' ; c<='z';c++){
          if(set_1.contains(c)&&set_2.contains(c)){
            count++;
          }
        }

        num = Math.max(num,count);

    }

    System.out.println(num);
  }
}
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = (a+b)/2;
      if((a+b)%2 != 0)
        ans = 0;
        

        System.out.println(ans != 0?ans:"IMPOSSIBLE");
    }
}

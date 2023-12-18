import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                sc.close();
                boolean 遭難者 = true;
                for(int i = 0 ; i <= b ; i++){
                        if((a * i - c) % b == 0) 遭難者 = false;
                }
                if(遭難者) System.out.println("NO");
                else System.out.println("YES");
        }
}
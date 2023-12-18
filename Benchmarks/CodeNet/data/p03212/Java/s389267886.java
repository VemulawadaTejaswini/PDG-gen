import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        for(int i=357; i<N; i++) {
            boolean f_3=false, f_5=false, f_7=false;
            int target = i;
            boolean valid = true;
            while(target>0) {
                int mod = target % 10;
//                System.out.println(String.format("mod=%d", mod));
                target/=10;
//                System.out.println(String.format("target=%d", target));
                switch(mod) {
                    case 3:
                        f_3 = true;
                        break;
                    case 5:
                        f_5 = true;
                        break;
                    case 7:
                        f_7 = true;
                        break;
                    default:
                        valid=false;
                        target=-10;
                        break;
                }
            }
            if(!valid) continue;
            if(f_3 && f_5 && f_7) {
                result++;
            }
        }
        System.out.println(result);
    }
}

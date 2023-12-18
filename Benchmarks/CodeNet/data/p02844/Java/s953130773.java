import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int cnt=0;
        for(int a=0; a<=9; a++) {
            for(int b=0; b<=9; b++) {
                for(int c=0; c<=9; c++) {
                    boolean ax=false, bx=false, cx=false;
                    for(int i=0; i<N; i++) {
                        char tmp = S.charAt(i);
                        if(!ax) {
                            if(tmp=='0'+a) {
                                ax=true;
                            }
                            continue;
                        }
                        if(!bx) {
                            if(tmp=='0'+b) {
                                bx=true;
                            }
                            continue;
                        }
                        if(!cx) {
                            if(tmp=='0'+c) {
                                cx=true;
//                                System.out.println(String.format("%d is valid.", 100*a+10*b+1*c));
                                cnt++;
                                break;
                            }
                            continue;
                        }
                    }
                }
            }
        }
        System.out.println(String.format("%d", cnt));
    }
}

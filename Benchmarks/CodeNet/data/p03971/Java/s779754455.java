import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                String s = sc.next();
                sc.close();
                for(int i = 0 ; i < n ; i++){
                        if(s.charAt(i) == 'c'){
                                System.out.println("No");
                        }else if(s.charAt(i) == 'a'){
                                if(a + b > 0){
                                        a--;
                                        System.out.println("Yes");
                                }else{
                                        System.out.println("No");
                                }
                        }else{
                                if(a + b > 0 && b > 0){
                                        System.out.println("Yes");
                                        b--;
                                }else{
                                        System.out.println("No");
                                        b = 0;
                                }
                        }
                }
        }
}
import java.util.Scanner;
    public class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            while(true){
            int a = sc.nextInt();
            String str = sc.next();
            int b = sc.nextInt();
            int answer = 0;

            if(str.equals("+")){
                answer = a + b ;
            }else if(str.equals("-")){
                answer = a - b ;
            }else if(str.equals("*")){
                answer = a * b ;
            }else if(str.equals("/")){
                answer = a / b ;
            }else if(str.equals("?")){
                break ;
            }
            System.out.println(answer);
        }
            sc.close();
        }
    }

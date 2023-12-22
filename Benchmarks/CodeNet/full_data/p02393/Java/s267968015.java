import java.util.Scanner;

public class Main{ 
        public static void main(String[] args){
            int temp = 0;
                Scanner num = new Scanner(System.in);
                     int a = num.nextInt();
                     int b = num.nextInt();
                     int c = num.nextInt();
                    if(a>b){
                        temp = a;
                        a = b;
                        b = temp;
                    }
                    if(b>c){
                        temp = b;
                        b = c;
                        c = temp;
                    }
                    if(a>b){
                        temp = a;
                        a = b;
                        b = temp;
                    }
                System.out.printf("%d %d %d\n",a,b,c);
        }
    }

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();int b = sc.nextInt();
        if(b>a){
            for(int i = a;i<=a*b;i++){
                if(i%a ==0 && i%b==0) {
                    System.out.println(i);
                    break;
                }
            }
        }else
            for(int i=b;i<a*b;i++) {
                if (i % a == 0 && i % b == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
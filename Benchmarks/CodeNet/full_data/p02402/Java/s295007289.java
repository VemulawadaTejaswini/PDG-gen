import java.util.Scanner;
class Main {
    int i,x,a;
    int min = 0;
    int max = 0;
    long sm = 0;
    public void yatary1(){
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if(x == 0){
            max = 0;
            min = 0;
        }else{
        for(i = 0;i < x;i++){
            a = sc.nextInt();
            sm += a;
            if(x == 1){
                break;
            }else if(a < min){
                min = a;
            }else if(a > max){
                max = a;
            }else if (a == min || a == max){
                continue;
            }
        }
        }
        System.out.println(min + " " + max + " " + sm);
    }
    public static void main(String[] args){
        new Main().yatary1();
    }
}
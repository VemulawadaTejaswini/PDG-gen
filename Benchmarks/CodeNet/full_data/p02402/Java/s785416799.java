import java.util.Scanner;
class Main {
    int i,x,a;
    int min = 9999999;
    int max = -9999999;
    long sm = 0;
    public void yatary(){
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
                max = a;
                min = a;
                break;
            }else if(a > max){
                max = a;
            }else if(a < min){
                min = a;
            }else if (a == min || a == max){
                continue;
            }
        }
        }
        System.out.println(min + " " + max + " " + sm);
    }
    public static void main(String[] args){
        new Main().yatary();
    }
}
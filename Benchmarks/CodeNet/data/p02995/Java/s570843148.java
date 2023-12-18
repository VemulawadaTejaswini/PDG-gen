import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = sc.nextLong();

    int count = 0;

    for(int i = 0; i<Math.pow(10,18);i++){
        if (a%b != 0){
            if(a%c != 0){
                count ++;
            }
        }
        a ++;
        if(a==b){
            break;
        }

    }
    System.out.println(count);
    }
}
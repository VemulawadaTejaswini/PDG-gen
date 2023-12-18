import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        long sum = 0;
        int num = 1;
        while(count != n){
            if(num%3==0&&num%5==0){

            }else if(num%5==0){

            }else if(num%3==0){

            }else{
                sum += num;
            }
            num++;
            count++;
        }
        System.out.println(sum);
    }
}
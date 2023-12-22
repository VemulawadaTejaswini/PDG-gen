import java.util.Arrays;
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String[] goods = new String[num];
        int count = 1;
        for(int i = 0; i < num ; i++){
            goods[i] = scan.next();
        }
        Arrays.sort(goods);
        for(int i = 0; i < num-1 ; i++){
            if(goods[i] .equals (goods[i + 1])){
            }else{
                count = count + 1;
            }          
        }
        System.out.println(count);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int sum = 0;
        int[] list = new int[nums];
        for(int i = 0; i < nums; i++){
            int num =  sc.nextInt();
            list[i]= num;
        }
        for(int k = 0; k < list.length; k++){
            for (int i = k+1; i < list.length ; i++) {
                for (int j = i+1; j <list.length ; j++) {
                    if(list[k] < list[i] + list[j] && list[i] < list[j] + list[k] && list[j] < list[i] + list[k]){
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}

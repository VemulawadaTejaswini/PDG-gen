import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        long num = 0;
        a = sc.nextInt();
        int list[] = new int[a];
        for(int i = 0;i < a; i++){
            list[i] = sc.nextInt();
            num = num + list[i];
        }
        int max = list[0];
        int min = list[0];
        for(int i = 0; i < list.length; i++){
            if(max < list[i]){
                max = list[i];
            }
            if(min > list[i]){
                min = list[i];
            }
        }
        System.out.println(min + " " + max + " " + num);
    }
}

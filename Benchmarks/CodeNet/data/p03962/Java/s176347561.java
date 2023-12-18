import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        int count = 0;
        int[] color = new int [3];
        for(int i = 0;i < 3;i++){
            color[i] = sc.nextInt();
        }
        for(int i = 0;i < 3;i++){
            for(int j = i+1; j < 3;j++){
                if(color[i] == color[j]){
                    count++;
                }
            }
        }
        if(count >=2){
            System.out.println(1);
        }
        else if(count == 1){
            System.out.println(2);
        }
        else{
            System.out.println(3);
        }
    }
}

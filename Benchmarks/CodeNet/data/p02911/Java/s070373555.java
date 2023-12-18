import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int sanka = sc.nextInt();
        int point = sc.nextInt();
        int seikai = sc.nextInt();
        int[] array_point = new int[sanka];
        int[] array_seikai = new int[seikai];
        for(int i = 0; i < sanka; i++){
            array_point[i] = point;
        }
        for(int i = 0; i < seikai; i++){
            array_seikai[i] = sc.nextInt();
        }

        for(int i = 0; i < seikai; i++){
            for(int j = 0; j < sanka; j++){
                if(array_seikai[i]-1 == j){
                    continue;
                }
                array_point[j]--;
            }
        }
        for(int i = 0; i < sanka; i++){
            if(array_point[i] <= 0){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }
        }
    }     
}
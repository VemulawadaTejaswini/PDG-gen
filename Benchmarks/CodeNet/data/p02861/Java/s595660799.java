import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int hoge = sc.nextInt();
        int[] array1 = new int[hoge];
        int[] array2 = new int[hoge];
        double sum = 0;
        for(int i = 0; i < hoge; i++){
            array1[i] = sc.nextInt();
            array2[i] = sc.nextInt(); 
        }
        for(int i = 0; i < hoge; i++){
            for(int j = 0; j < hoge; j++){
                if(i == j){
                    continue;
                }
                sum += Math.sqrt(Math.pow(array1[i] - array1[j], 2) + Math.pow(array2[i] - array2[j], 2));
            }
        }
        System.out.println(sum/hoge);
    }     
}
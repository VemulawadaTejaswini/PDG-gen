import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);
    
    private static int[] inputArray(){
        int num = sc.nextInt();
        int[] array = new int[num];
        for(int i = 0; i < num; i++){
            array[i] = sc.nextInt();
        }
        return array;
    }
    
    public static void main(String[] args){
        int[] s = inputArray();
        int[] t = inputArray();
        int count = 0;
        for(int i = 0; i < t.length; i++){
            for(int j = 0; j < s.length; j++){
                if(t[i] == s[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

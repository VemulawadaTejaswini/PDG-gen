import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);
    
    private static boolean binarySearch(int[] array, int key){
        int left = 0;
        int right = array.length;
        int mid = 0;
        while(left < right){
            mid = (left + right) / 2;
            if(array[mid] == key) return true;
            if(array[mid] < key){
                left = mid + 1;
            }else if(array[mid] > key){
                right = mid;
            }
        }
        return false;
    }
    
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
            if(binarySearch(s, t[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}

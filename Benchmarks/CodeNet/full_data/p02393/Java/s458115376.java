import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int temp;
        int[] array = new int[3];
        array[0] = scanner.nextInt();
        array[1] = scanner.nextInt();
        array[2] = scanner.nextInt();

        for(int i = 0; i < array.length - 1; i++){
            for(int j = i; j < array.length; j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i = 0; i < array.length ; i++){
            if(i != array.length)System.out.print(array[i] + " ");
            else System.out.println(array[i]);
        }
    }
}


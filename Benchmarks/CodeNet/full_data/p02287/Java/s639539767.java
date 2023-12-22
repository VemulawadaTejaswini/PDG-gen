import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] heapArray = new int[size + 1];

        // Populate array
        for(int i = 1; i <= size; i ++){
            heapArray[i] = scanner.nextInt();
        }

        for(int i = 1; i <= size; i ++){
            System.out.print("node " + i + ": key = " + heapArray[i] + ", ");
            
            // If not the first node, has a parent
            if(i >= 2){
                System.out.print("parent key = " + heapArray[i/2] + ", ");
            }

            // Left index
            if(i*2 <= size){
                System.out.print("left key = " + heapArray[i*2] + ", ");
            }
            
            // Right index
            if((i*2 + 1) <= size){
                System.out.print("right key = " + heapArray[i*2 + 1] + ", ");
            }
            System.out.println();
        }

    }


}

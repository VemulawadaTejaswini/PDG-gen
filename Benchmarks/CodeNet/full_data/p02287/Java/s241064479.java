
import java.util.Scanner;


class Main{
    public static void main(String args[]){
        
        int leftIndex;
        int rightIndex;
        
        Scanner bob = new Scanner(System.in);
        int h = bob.nextInt();
        int[] turtle = new int[h];
        for(int i = 0; i < h; i++){
            turtle[i] = bob.nextInt();
        }
        for(int i = 0; i < h; i++){
            System.out.print("node " + (i+1) + ": ");
            System.out.print("key = " + turtle[i] + ", ");
            if(i > 0){
                System.out.print("parent key = " + turtle[(int)((i-1)/2)]+ ", ");
            }
            if(i < h/2){
                leftIndex = 2*(i)+1;
                rightIndex = 2*(i)+2;
                if(leftIndex < h){
                    System.out.print("left key = " + turtle[leftIndex]+ ", ");
                }
                if(rightIndex < h){
                    System.out.print("right key = " + turtle[rightIndex] + ", ");
                }
            }
            System.out.println();
        }
    }
}

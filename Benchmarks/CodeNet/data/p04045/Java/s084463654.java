
import java.util.Arrays;
import java.util.Scanner;

class Main {


    public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }

    public static boolean check(int n,int [] arr){
        while (n>0){
            if(contains(arr,n%10)){
                return true;
            }
            n=n/10;
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner inpunt = new Scanner(System.in);
        int x ,y ;

        x=inpunt.nextInt();
        y=inpunt.nextInt();
        inpunt.nextLine();
        int array[] = new int[y];

        for(int i=0;i<y;i++){
           array[i]=inpunt.nextInt();

        }

        while (check(x,array))
            x++;

        System.out.println(x);


    }
}
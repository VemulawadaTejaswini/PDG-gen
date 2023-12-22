import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int w = scn.nextInt();
        int n = scn.nextInt();

        int[] array;
        array = new int[w];

        for(int i = 0; i < w; i++){
            array[i] = i + 1;
        }

        String emp = scn.nextLine();

        for(int i = 0; i < n; i++){

            String str = scn.nextLine();
            int count = 0;

            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == ',') break;
                count++;
            }

            int a = Integer.parseInt(str.substring(0,count));
            int b = Integer.parseInt(str.substring(count + 1));
            Swap(a,b,array);
        }

        for(int k = 0; k < w; k++){
            System.out.println(array[k]);
        }
    }

    static void Swap(int a,int b, int[] array) {
        int tmp = array[a - 1];
        array[a - 1] = array[b - 1];
        array[b - 1] = tmp;
    }
}


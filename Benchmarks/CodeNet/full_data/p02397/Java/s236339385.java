import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[][] array = new int[3000][2];
        int x, y;
        int counter = 0;
        while(true){
            x = scanner.nextInt();
            y = scanner.nextInt();
            if(x == 0 && y == 0)break;
            array[counter][0] = x;
            array[counter][1] = y;
            counter++;
        }
        for(int i = 0; i < counter; i++){
            if(array[i][0]>array[i][1])
                System.out.println(array[i][1]+" "+array[i][0]);
            else
                System.out.println(array[i][0]+" "+array[i][1]);
        }
    }
}

